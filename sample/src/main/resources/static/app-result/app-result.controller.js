'use strict'

angular.
    module('sampleApp').
        controller('appResult', function AppResultController($scope, $location, dataService, $http) {
            var resultSelf = this;
            resultSelf.dto = function() {
                this.infoList = dataService.formData.wantedInfoList;
                //서울 Index == 0 html 화면 단에서 사용
                this.selectArea = dataService.formData.wantedAreaList[0];
                this.selectBusiness = dataService.formData.wantedBusiness;

                resultSelf.receiveSido = null;
                resultSelf.receiveSangho = null;
                resultSelf.madeData = null;

                //index값에 따라 표현되는 데이터가 달라짐
                resultSelf.showIndex = -1;
            }
            resultSelf.dto();

            // <?sido=서울특별시> 로 데이터 받아오기
            resultSelf.getSido =function() {
                var dataSido ={
                    wantedAreaList: dataService.formData.wantedAreaList
                }
                $http({
                    method: 'GET',
                    url: 'api/sido',
                    params: dataSido,
                    headers: {'Content-Type': 'application/json; charset=utf-8'}
                }).then(function success(response){
                    resultSelf.receiveSido = response.data;//response.data;
                    console.log(resultSelf.receiveSido);
                    }, function error(response){
                    console.log(response);
                });
            };
            resultSelf.getSido();

            // <?dong=oo동&upjong=oo>로 데이터 받아오기
            resultSelf.getSangho =function(data, index) {
                resultSelf.madeData = -1;
                $http({
                    method: 'GET',
                    url: 'api/sangho',
                    params: data,
                    headers: {'Content-Type': 'application/json; charset=utf-8'}
                }).then(function success(response){
                    resultSelf.receiveSangho = response.data;//response.data;
                    console.log(resultSelf.receiveSangho);
                    resultSelf.madeData = resultSelf.makeData(resultSelf.receiveSangho, resultSelf.infoList, index);

                    console.log("==madeData==");
                    }, function error(response){
                    console.log(response);
                });

            };

            resultSelf.makeData = function(data, infoList, index) {
                console.log("===makeData FUNC===");
                var totalSidoSangho = {
                    dong: resultSelf.clickedDong
                };

                //indexOf()를 통해 없는 내용이면 -1 를 리턴
                if (infoList.indexOf("점포 수") !== -1) {
                    totalSidoSangho.cnt = data.length;
                }

                if (infoList.indexOf("평균 유지 기간") !== -1) {
                    var sum = 0;
                    for(var i in data) {
                        sum += data[i].months;
                    }
                    totalSidoSangho.averageMonth = (sum/data.length).toFixed(2);
                }

                //api/sido에서 받은 데이터 가져오는 부분
                if (infoList.indexOf("폐업률") !== -1) {
                    console.log("not_alive_ratio")
                    console.log(resultSelf.receiveSido[index].not_alive_ratio);
                    totalSidoSangho.notAliveRatio = resultSelf.receiveSido[index].not_alive_ratio.toFixed(2);
                }

                if (infoList.indexOf("폐업사업장수") !== -1) {
                    totalSidoSangho.notAliveCnt = resultSelf.receiveSido[index].not_alivecnt;
                }

                if (infoList.indexOf("유지사업장수") !== -1) {
                    totalSidoSangho.aliveCnt = resultSelf.receiveSido[index].alivecnt;
                }
                return totalSidoSangho;
            };

            resultSelf.printGu = function(dong) {
              if (dong === "신설동") {
                  return "동대문구";
              } else if(dong === "충무로2가") {
                  return "중구";
              } else if(dong === "명동2가") {
                  return "중구";
              } else if(dong === "마장동") {
                  return "성동구";
              } else if(dong === "종로6가") {
                  return "종로구";
              } else if(dong === "논현동") {
                  return "강남구";
              } else if(dong === "태평로1가") {
                  return "중구";
              } else if(dong === "회현동2가") {
                  return "중구";
              } else if(dong === "서초동") {
                  return "서초구";
              } else if(dong === "삼성동") {
                  return "관악구";
              } else {
                  return "서울시";
              }
            };


            resultSelf.show = function (index) {
                resultSelf.clickedDong = document.frm[index].dong.value;

                var dataSangho = {
                    wantedDong: resultSelf.clickedDong,
                    wantedBusiness: resultSelf.selectBusiness
                };

                console.log("---show clikedDong--");
                console.log(resultSelf.clickedDong);

                resultSelf.getSangho(dataSangho, index);
                resultSelf.showIndex = index;
                //iframe에 지도 표시
                // ?q= 서초동 분식
                if(document.frm[index].q.value) {
                    console.log("iframe")
                    document.frm[index].submit();
                }
            };
        });