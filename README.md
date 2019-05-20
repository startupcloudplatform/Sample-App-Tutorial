# 창업 플랫폼 활용 가이드

 
- ### [클라우드 기반 창업 플랫폼 개요](#클라우드-기반-창업-플랫폼-개요)

  - [SW개발 지원 서비스](#SW개발-지원-서비스)
  - [시스템 구성도](#시스템-구성도)
  - [창업 플랫폼 사용자 가이드](#창업-플랫폼-사용자-가이드)
  - [PaaS-TA 기반](#PaaS-TA-기반)

- ###  [샘플앱 개발 튜토리얼](<https://github.com/startupcloudplatform/Sample-App-Tutorial/blob/master/Tutorial.md>)

  - 샘플 앱 개요
  - 샘플앱 프로젝트 시작
    - 백엔드 앱 개발
    - 프론트엔드 앱 개발

  - PaaS-TA 상에 앱 배포하기
  - 마이크로서비스 앱 구성
  - API 관리 
- ### [PaaS-TA 활용](<https://github.com/startupcloudplatform/Sample-App-Tutorial/blob/master/paasta.md>)

- ### [마이크로서비스 개요](<https://github.com/startupcloudplatform/Sample-App-Tutorial/blob/master/microservice.md>)

  
------

# 클라우드 기반 창업 플랫폼 개요

개방형 클라우드 기반의 SW개발 지원 도구의 부족과 창업자(사업자)의 제품 상용화 지원의 필요성으로 기존 제공되는 Open PaaS 서비스에 더 풍부한 SW개발지원 서비스를 제공하여 클라우드 기반의 소프트웨어 개발에 필요한 다양한 서비스를 제공하는 개발 플랫폼이다. 클라우드 기반 창업 플랫폼은 과학기술정보통신부의 재원으로 정보통신산업진흥원의 지원을 받아 Open PaaS 활성화 사업으로 총 18개월동안 수행하였다. 

## SW개발 지원 서비스

창업 플랫폼은 창업 개발자를 위한 세가지의 서비스를 포함하고 있다. 오픈데이터API 게이트웨이 시스템은 PaaS-TA 상에서 제공되는 서비스는 아니기 때문에 언제 어디서나 구분없이 사용이 가능하다. 나머지 서비스 브로커와 마이크로서비스 스튜디오는 PaaS-TA 상에서 동작하기 때문에 PaaS-TA와 밀접한 관련이 있다.  

1. **오픈데이터API 게이트웨이 시스템 포털**

공공기관 및 오픈API를 제공하는 각 부처 정보를 통합하여 포털로 제공하며 CKAN을 이용한 여러기관의 정보라도 한번의 신청만으로 승인과 사용이 가능하며 가장 많이 사용하는 인기API, 추천API와 같은 부가적인 기능도 제공하는 시스템이다.

- 15개 기관 정보 통합 OPEN API 제공 
- 통합(단일) 인증
- 인기 추천 서비스 

2. **빅데이터, AI기반 상권분석 브로커**   

개방형 클라우드(PaaS-TA) 기반의 빅데이터 서비스 브로커와 AI기반의 창업후보지역을 제공하는 서비스 브로커를 제공한다. PaaS-TA 3.0 기반으로 개발이 되었으며 빅데이터는 5종, AI 기반 상권분석 브로커는 2종의 어댑터를 제공한다.

- 빅데이터 수집/저장/분석/가공/가시화(5종)

- AI기반 상권분석 추천모델생성/추천모델관리(2종)

3. **마이크로서비스 스튜디오** 

개방형 클라우드 상에서 동작하는 마이크로서비스 기반 개발 시 마이크로서비스를 쉽게 구성할 수 있고 앱 간의 호출 관계를 비주얼 편집기를 통해 제공하고 개발된 마이크로서비스 앱에 정의된 API를 공개하고 사용할 수 있도록 구성되어 있다. 

- 마이크로서비스 구성을 위한 비주얼 편집기 도구
- PaaS-TA 연동 마이크로서비스 앱 구성
- 마이크로서비스 보안
- 마이크로서비스 API 공개


## 시스템 구성도

창업 플랫폼의 시스템 구성도는 다음과 같다. 

![](https://github.com/startupcloudplatform/Sample-App-Tutorial/blob/master/images/susystem.png)

<창업 플랫폼 시스템 구성도>

 

## 시스템 요구사항

- 오픈데이터API 게이트웨이 포털

  웹포털 사이트로 제공하고 있어 별도의 시스템 요구사항이 없다.

  [OPEN DATA GATEWAY PORTAL](http://182.252.131.40:3000)


- 빅데이터 서비스 브로커, AI기반 상권분석 브로커

  PaaS-TA 3.0 기반에서 실행되는 서비스 브로커로 개발되어 PaaS-TA 3.0, 3.5에서 동작한다. 

  설치 가이드 참조

- 마이크로서비스 스튜디오

  PaaS-TA 3.0 기반으로 개발되어 PaaS-TA가 설치되어 있어야 한다. PaaS-TA와 연동하여 동작하도록 구성되어 있다. 

  설치 가이드 참조


## 창업 플랫폼 사용자 가이드

- 오픈데이터API 게이트웨이 포털 사용자 가이드
- 빅데이터 서비스 브로커 사용자 가이드
- AI기반 상권분석 브로커 사용자 가이드
- 마이크로서비스 스튜디오 사용자 가이드
- 창업 플랫폼 활용 튜토리얼



## PaaS-TA 기반

 PaaS-TA 는 정부에서 오픈소스 Cloud Foundry를 기반으로 개발한 한국형 개방형 클라우드 플랫폼이다. 2015년 PaaS-TA 1.0출시 이후 2018년 12월에 PaaS-TA 링귀니 버전이 출시되었다. 창업플랫폼에서는 PaaS-TA 3.0(Penne) 기준으로 제공한다. 보다 자세한 내용은 아래 링크를 통해 확인할 수 있다. 

<https://guide.paas-ta.kr/guide-3.5-penne#undefined-4>

