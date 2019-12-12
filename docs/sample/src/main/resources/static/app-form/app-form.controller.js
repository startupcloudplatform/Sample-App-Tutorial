'use strict';

angular.
module('sampleApp').
    controller('appForm', function AppFormController($scope, $http, dataService, $location, $window) {
        //this로 그냥 사용하는 것은 작동안함. this.wantedInfo(x)
        var formSelf = this;
        formSelf.dto = function() {
            //business Menu = [0, 1, 2, 3]
            formSelf.activeBusiness = -1;
            formSelf.activeArea = -1;
            formSelf.nextPage = '#!/forms';
            formSelf.business = {
                //list: ["분식", "카페","치킨", "편의점"],
                list: [],
                //slt: false
            };

            formSelf.wantedInfo = {
                list: []
            };

            formSelf.area = {
                list: []
            };
        };
        //AppFormController에서 사용할 변수 선언
        formSelf.dto();

        //form에 사용할 메뉴
        formSelf.setForm = function() {
            //set business menu
            $http.get('/common/form/businesses.json').then(function(response) {
                formSelf.business.list = response.data;
            });

            //set wantedInfo menu
            $http.get('/common/form/wantedInfos.json').then(function(response) {
                formSelf.wantedInfo.list = response.data;
            });

            //set area menu
            $http.get('/common/form/areas.json').then(function(response) {
                formSelf.area.list = response.data;
                //type이 checkbox가 아님
                for(var i = 0; i< formSelf.area.list.length; i++) {
                    formSelf.area.list[i].checked = false;
                }
            });
        };
        formSelf.setForm();

        //Business 메뉴색 조작
        formSelf.setStyleBusiness = function(index, businessName) {
            formSelf.activeBusiness = index;
            formSelf.business.slt = businessName;
        };

        formSelf.setStyleArea = function(index) {
            //서울만 선택하게 하기 위한 작업
            //클릭시 on-off
            if (index === 0) {//서울이 index == 0
                formSelf.area.list[index].checked = !formSelf.area.list[index].checked;
                if(formSelf.area.list[index].checked) {
                    formSelf.activeArea = index;
                } else {
                    formSelf.activeArea = -1;
                }
            }
            //서울이 아닐때
            else {
                $window.alert("데이터가 없습니다.");
                formSelf.activeArea = -1;
                for(var i = 0; i < formSelf.area.list.length; i++) {
                    formSelf.area.list[i].checked = false;
                }
            }
        };

        formSelf.sendForm = function(url) {
            //선택된 내용 초기화
            formSelf.area.sltList = [];
            formSelf.wantedInfo.sltList = [];

            for ( var i = 0; i < formSelf.area.list.length; i++) {
                if (formSelf.area.list[i].checked) {
                    formSelf.area.sltList.push(formSelf.area.list[i].name);
                }
            }

            for ( var i = 0; i < formSelf.wantedInfo.list.length; i++) {
                if (formSelf.wantedInfo.list[i].checked) {
                    formSelf.wantedInfo.sltList.push(formSelf.wantedInfo.list[i].name);
                }
            }
            // form을  다 채웠는지 아닌지 확인하는 작업
            if (formSelf.area.sltList.length !== 0 &&
                formSelf.wantedInfo.sltList.length !== 0 &&
                formSelf.business.slt !== undefined) {
                formSelf.nextPage = url;
            } else {
                $window.alert("모든 양식을 선택해주세요.");
            }

            //dataService를 통해 공유할 데이터
            var dataObject = {
                wantedAreaList: formSelf.area.sltList,
                wantedInfoList: formSelf.wantedInfo.sltList,
                wantedBusiness: formSelf.business.slt
            };
            dataService.formData = dataObject;
        };
    });