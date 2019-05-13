# Tutorial

 창업 플랫폼에서 제공하는 다양한 SW개발에 필요한 서비스를 이용한 앱을 개발하는 과정을 설명하는 문서이다. 이 튜토리얼을 좀 더 잘 활용하기 위해서는 사전에 PaaS-TA을 사용해봤거나 교육 과정을 이수하는 것이 도움이 된다. 

이 튜토리얼의 구성은 다음과 같다.

- 샘플 앱 개요
- PaaS-TA 사용
- eclipse 활용 개발 환경 구축
- 마이크로서비스 개발 가이드
- 백엔드 앱 개발
- 프론트엔드 앱 개발
- 마이크로서비스 구성
- API 공개
- 샘플 앱 배포 및 운영



창업 플랫폼에서는 각 기 다른 특성을 갖고 있는 서비스를 제공하기 때문에 개발하고자 하는 앱에 따라 선택적으로 사용할 수 있다. 

- 오픈데이터API 게이트웨이 시스템은 포털 사이트로 제공하기 때문에 반드시 PaaS-TA 기반일 필요는 없다. 

- 빅데이터 서비스 브로커, AI기반 상권분석 브로커는 개발 아이디어에 관련 분야의 기술을 적용할 필요가 있는 경우 유용하다. PaaS-TA 3.0 기반으로 제공하기 때문에 PaaS-TA 상에서 개발해야 한다. 

- 마이크로서비스 스튜디오의 경우에도 위에 언급한 두가지 서비스와 무관하게 PaaS-TA 상에서 개발하는 개발자가 마이크로서비스 기반으로 개발을 하는 경우에 사용이 가능하다. 

 

## 샘플 앱 개요

클라우드 기반 창업 플랫폼을 활용하여 샘플로 제작된 앱으로 오픈데이터API 게이트웨이 포털과 빅데이터 서비스 브로커, AI기반 상권 분석 브로커 및 마이크로서비스 기반 개발 기능을 활용하여 개발되었다. 

이 사이트에서는 업종별 창업하기에 적합한 지역을 찾아주는 웹사이트로 자영업 예비창업자가 주 이용자이다. 업종 정보[치킨, 분식, 카페 등]를 제공하고 원하는 지역의 상권정보를 제공해준다. 이 사이트의 핵심 기능은 소상공인진흥공단에서 오픈한 상권API를 활용하여 이용자에게 최적의 정보 제공을 위한 빅데이터 서비스와 AI기반 상권분석 서비스를 연동하여 개발한다.  또한, 마이크로서비스 기반으로 개발하여 빠르게 제공할 서비스는 우선 개발하고 향 후에 추가할 서비스가 쉽게 확장할 수 있도록 한다. 

 *[본 샘플 앱 프로젝트는 마이크로서비스 기반으로 개발을 위해 앱을 여러개로 분할하여 개발을 수행한다. 여기에서는 프론트엔드앱과 백엔드앱 각각 1개씩 개별 개발하여 구축하는 순서로 설명한다]*



샘플앱에서 제공하는 주요 기능은 아래와 같다.

### 주요 기능

- 업종별 창업 지역 찾기 : 치킨, 분석, 편의점 등 업종을 선택하고 원하는 상권 정보를 선택한다. 특정 지역을 선택하면 지역에서 가장 우선순위가 높은 지역 순으로 상권 정보를 제공하고 해당 지역을 지도로 보여준다. 
- 부동산 매물 정보 : 자신이 보유한 투자 비용으로 창업이 가능한 지역에 부동산 매물 정보를 제공하는 서비스
- 추천 지역 : AI추천 서비스를 이용하여 내게 맞는 업종과 위치를 찾아주는 서비스. 선호하는 유형만으로 추천을 해주는 서비스

위와 같이 개발 아이디어에는 여러 종류의 서비스를 제공하고자 하는 경우라도 짧은 시간에 많은 서비스를 제공하는 앱을 출시하는 것이 창업자에게는 어려움이 있기 때문에 마이크로서비스 기반 개발을 이용하여 우선 오픈할 서비스와 나중에 오픈할 서비스를 분류한다. 우선 개발이 가능한 서비스를 다시 마이크로서비스 단위로 분할하여 개발을 진행한다.



### 주요 사용 기술

공공데이터포털을 통해 제공하는 소상공인진흥공단의 상권API를 이용하여 데이터를 수집하고 수집한 데이터는 빅데이터 서비스 브로커를 활용하여 분석 및 가공 어댑터 기능을 이용한다. 이 밖에도 여러 어댑터를 활용하여 창업지역 정보와 상권 정보를 제공하는 API를 개발한다. 

\-       소상공인진흥공단의 상권정보API

\-       수집 서비스 브로커(Rest API 어댑터) 

\-       저장 서비스 브로커(DB 어댑터) 

\-       가공 서비스 브로커(ETL 어댑터)

\-       분석 서비스 브로커(분류 어댑터)

\-       AI 브로커(지능형 창업 후보지역 상권분석 어댑터)

\-       마이크로서비스 앱 분할 및 아키텍처 구성



### 마이크로서비스 기반 개발

마이크로서비스 기반으로 개발을 위해 제공하는 서비스를 비지니스 영역, 데이터베이스 종속성 등을 고려하여 분할한다. 여기에서는 향후 확장할 서비스를 포함하여 총 4개의 앱으로 분할하여 개발한다고 간주한다.

사용자 UI제공을 위한 프론트앤드 앱과 창업지역 찾기 정보를 제공하는 백엔드 앱을 우선 개발영역으로 본다.

![](https://github.com/startupcloudplatform/Sample-App-Tutorial/tree/master/images/apigateway.png)



## 샘플 앱 프로젝트 

본 튜토리얼에서는 eclipse 4.10.0을 기준으로 작성되었다. PaaS-TA 에서도 WEB IDE를 제공하고 있으며 활용이 가능하다. 



### 개발 환경 요구사항

| 요구사항     | 버전  |
| ------------ | ----- |
| AngularJS    |       |
| Java         | 1.8   |
| Spring Boot  | 1.5.9 |
| Spring Cloud | 1.6.1 |
| swagger API  | 2.0.0 |

- Service Broker (창업플랫폼의 PaaS-TA에서 제공함)

​       ankus service broker 

- Open PaaS 

​      PaaS-TA 3.0(Penne)

 https://guide.paas-ta.kr/guide-3.5-penne

 

### 튜토리얼 실행 소스 코드

샘플앱은 Frontend 는 AngularJS 1을 사용하였고 Backend 앱의 API 호출 부분은 JAVA를 이용하였다. 버전은 개발 요구사항에 언급된 내용을 확인하고 구축한다. 

Github에 공개된 소스코드를 로컬에 내려 받고 eclipse 에서 프로젝트 생성 시 기존 폴더를 오픈하여 생성한다. 

https://github.com/startupcloudplatform/Sample-App-Tutorial.git



### 프론트앤드 앱 개발[eclipse 이용]

여기에서는 eclipse 4.10 버전을 이용하여 프로젝트 생성하는 방법을 설명한다. Eclipse에서 Maven project를 생성하고 JAVA 1.8을 적용한다. 개발 환경 구축 시  Spring Boot, Spring cloud 등 dependency 필수 정의 부분을 [pom.xml]()에 정의한다. eclipse maven proejct 생성 후 기본 폴더 구조는 아래 그림과 같이 정의된다.  

![](https://github.com/startupcloudplatform/Sample-App-Tutorial/blob/master/images/eclipse-folder.png)



#### 마이크로서비스 앱 개발 필수 항목 정의

마이크로서비스 앱 개발은 여러 개의 앱을 구성하여 구동하는 방식으로 개발 환경 설정 시 여러 필수 체크 부분이 존재한다. 특히, JAVA Spring cloud 기반 코딩을 위한 dependency를 정의한다.

##### pom.xml 파일 수정

초기 환경 구축 시 pom.xml에 마이크로서비스 앱 개발을 위한 <parent></parent>와 <properties></properties> 를 아래의 내용을 복사하여 pom.xml에 붙여넣기 한다.  JAVA: 1.8이상, Spring Boot: 1.5.13, Spring Cloud: Edgware.RELEASE 는 필수 체크 항목이다. 

```
   <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>1.5.9.RELEASE</version>
        <relativePath/> <!-- lookup parent from repository -->
   </parent>
   
   <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <java.version>1.8</java.version>
        <spring-cloud.version>Edgware.RELEASE</spring-cloud.version>
   </properties>
```



java spring cloud 기반 코딩을 위한 필수 dependency 정의를 위해 아래 내용을 복사하여 pom.xml에 붙여넣기 한다. 

```
<dependencies>
  <!-- required start -->
  <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-config</artifactId>
  </dependency>
  <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-eureka</artifactId>
  </dependency>
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
  </dependency>
  <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-hystrix</artifactId>
  </dependency>
  <dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.3.1</version>
  </dependency>
  <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
  </dependency>
  <dependency>
    <groupId>io.pivotal.spring.cloud</groupId>
    <artifactId>spring-cloud-services-cloudfoundry-connector</artifactId>
    <version>1.6.1.RELEASE</version>
  </dependency>
  <dependency>
    <groupId>io.pivotal.spring.cloud</groupId>
    <artifactId>spring-cloud-services-spring-connector</artifactId>
    <version>1.6.1.RELEASE</version>
  </dependency>  
  <!-- required end -->
</dependencies>
```



##### java 파일에 annotation 정의

java 프로젝트 생성 후 디폴트로 생성된 App.java 파일에 annotation을 정의한다. annotation은 java spring cloud 의 eureka 기능 사용과 rest api 명세를 위한 swagger 필수 annotation 이다. App.java의 기존 내용을 모두 삭제하고 아래 내용을 복사하여 붙여넣기 한다. 

@EnableDiscoveryClient, @EnableCircuitBreaker, @EnableSwagger2

```
package com.example.sample.front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
public class App {

    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

@Configuration
@EnableSwagger2
class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/api/**"))
                .build();
    }
}
```

**@EnableDiscoveryClient**    /* Service Discovery 정의

Eureka 서버가 서비스를 탐색할 때 사용한다. 서비스 검색(Service Discovery)은 마이크로서비스 기반 아키텍처의 핵심 기술요소로  각 클라이언트 또는 일부 형식을 수동으로 구성하는 것은 매우 어려울 수 있다. Eureka는 Netflix 서비스 검색 서버 및 클라이언트로 서버는 등록된 서비스에 대한 상태를 다른 서버로 복제하여 각 서버가 HA(고가용성) 구성 및 배치를 할 수 있다
Eureka client설정: Eureka Server가 작동하고 있는 상태에서 Eureka client를 시작하면 Eureka Server의 Registry에 등록된다.  @EnableDiscoveryClient을 활성화시킨 상태에서서 RestTemplate Bean 에 @LoadBalanced만 달아주면 모든 설정을 Spring Boot에서  자동으로 해준다..

**@EnableCircuitBreaker**   /* 서비스 부하 차단기 정의

Netflix는 Circuit Breaker 패턴을 구현을 위한 Hystrix라는 라이브러리를 만들 수 있다. 마이크로서비스 아키텍처에서는 다음 예제와 같이 여러 개의 서비스 호출 계층을 갖는 것이 일반적이다. 

ex) Hystrix Stream 샘플 예제

![Hystrix](https://raw.githubusercontent.com/spring-cloud/spring-cloud-netflix/master/docs/src/main/asciidoc/images/Hystrix.png)

[출처:<https://cloud.spring.io/spring-cloud-netflix/multi/multi__circuit_breaker_hystrix_clients.html>]



**@LoadBalanced**       /* Netflix Ribbon을 자동 적용, 

Service Discovery을 IP대신 찾아서 서비스이름으로 사용할 수 있다. 

**@EnableSwagger2**    /* swagger API 정의

Swagger2는 RESTful 웹 서비스 용 REST API 문서를 생성하기 위해 사용되는 오픈 소스 프로젝트이다. 웹 브라우저를 통해 RESTful 웹 서비스에 액세스 할 수 있는 사용자 인터페이스를 제공한다. Spring Boot 애플리케이션에서 Swagger2를 사용하려면 dependency을 추가해야 한다. 앞에서 설명한 pom.xml 에 추가한다. 

```
 <dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.3.1</version>
 </dependency>
```



##### manifest.yml 생성하기

PaaS-TA에 앱을 푸시할때 사용하는 환경설정 파일이며 manifest.yml 이름으로 생성한 후 아래 내용을 복사한 후 붙여넣기 한다.

**필수 환경설정변수 : msa**

```
---
applications:
  - name: front
    memory: 1G
    path: target/front-0.0.1-SNAPSHOT.jar
    env:
      msa: true
```



##### application.properties 생성하기

마이크로서비스 앱 이름 정의하는 파일로 application.properties 이름으로 생성한다. 

소스코드 경로 : src/main/resources/application.properties

```
spring.application.name=front
```



#### RestController 정의

마이크로서비스는 여러 앱을 API로 연동되어 있기 때문에 controller를 정의해야 한다. 

```
package com.example.sample;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.*;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
```

**@RestController**

REST API는 외부에서 정해진 호출 방식으로 특정 URI를 통해서 사용자가 원하는 정보를 제공하는 방식이다.  REST 방식의 서비스 제공이 가능한 것을 Restful이라고 한다. 

백엔드 앱에서 정의한 API 호출하여 새로운 API를 생성하는 클래스를 생성하였다. 

```
@RestController
@RefreshScope
public class TestCntroller {
	
	@Autowired
    private RestTemplate searchClient;
	//마이크로서비스 config쪽에서 basic auth정보 가져오는 부분
    //spring apllication property 문법 참조
    @Value("${gateway.basic.user: }")
    String user;

    @Value("${gateway.basic.password:}")
    String password;

    Object responseReturn = null;
    //HttpHeader를 BasicAuth추가하는 함수
    private HttpHeaders getHeaders(){
        String basicAuth = String.format("%s:%s", user, password);
        String base64Auth = Base64Utils.encodeToString(basicAuth.getBytes());

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", String.format("Basic %s", base64Auth));
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        return headers;
    }
 }
```



## PaaS-TA 앱 PUSH

코딩이 완료된 소스를 Maven Build를 이용하여 *.jar를 생성한다. 생성된 *.jar 파일을 PaaS-TA에 push한다. PaaS-TA를 이용할 수 있는 환경에서는 포털사이트를 통해서도 앱 push가 가능하다. 여기에서는 Cloud Foundry Cli를 통해서 Push 하는 방법을 설명한다. *PaaS-TA 사용자가이드 참조*

#### PaaS-TA 포털 로그인

접속 가능한 PaaS-TA 사용자 포털을 이용하여 앱을 푸시할 수 있다. 계정을 갖고 있다면 포털 로그인이 가능하다. 



#### CF Login

PaaS-TA 계정을 갖고 있다면 Cloud-Foundry 접속 경로를 통해서 로그인한다. 

```
$ cf login -a 접속URI --skip-ssl-validation
API endpoint: 접속URI
Email>계정
Password>비밀번호
Authenticating...
OK

Targeted org system
Targeted space paas-ta

API endpoint:   https://api.11.123.123.22.xip.io(API version: 2.116.0)
User:           admin
Org:            system
Space:          paas-ta
```



#### 앱 Push

소스코드 경로로 이동하고 앱 push 명령어를 입력하여 앱을 push한다. 이때, manifest.yml이 정의되어 있는지 확인한다. PaaS-TA 앱 push를 위해서는 이 파일이 필수이다.

```
$ cf push startup
```

buildpack호출 과정과 Configuration 설정과정을 거쳐 앱이 컨테이너에 push된다. 앱이 정상적으로 push되었는지 확인한다. 

```
$ cf app startup
Showing health and status for app startup in org Org1 / space DEV as admin...

name:              startup
requested state:   started
routes:            uvaj4b89pd.msxpert.co.kr
last uploaded:     Fri 26 Apr 16:36:37 KST 2019
stack:             cflinuxfs2
buildpacks:        java_buildpack-v4-15

type:           web
instances:      1/1
memory usage:   1024M
     state     since                  cpu    memory       disk           details
#0   running   2019-04-26T07:37:07Z   0.2%   217M of 1G   183M of 512M
```



#### 환경변수 정의

manifest.yml 파일에 정의된 사용자정의 환경변수가 정의되어 있는지 확인한다.

```
$ cf env startup
```

결과

```
{
 "VCAP_APPLICATION": {
  "application_id": "13e72952-9128-4406-b5a1-a0927952512a",
  "application_name": "startup",
  "application_uris": [
   "uvaj4b89pd.msxpert.co.kr"
  ],
  "application_version": "e1b5522f-23df-48c0-8003-8e67867c31d7",
  "cf_api": "https://api.msxpert.co.kr",
  "limits": {
   "disk": 512,
   "fds": 16384,
   "mem": 1024
  },
  "name": "startup",
  "space_id": "46ad022f-bf06-43c9-b2f8-1d4809c96daf",
  "space_name": "DEV",
  "uris": [
   "uvaj4b89pd.msxpert.co.kr"
  ],
  "users": null,
  "version": "e1b5522f-23df-48c0-8003-8e67867c31d7"
 }
}

User-Provided:
msa: true
```



## 마이크로서비스 스튜디오

PaaS-TA에 push된 앱은 마이크로서비스 스튜디오를 이용하여 마이크로서비스를 구성한다. 마이크로서비스 구성을 위해 개발된 프론트앤드 앱, 백엔드 앱 모두 PaaS-TA에 push되어 있어야 한다. 

마이크로서비스 스튜디오 사용 방법은 [사용자 가이드]()를 참조한다.

#### [마이크로서비스 접속하기]() 

### 마이크로서비스 구성 하기

1. 마이크로서비스 스튜디오의 추가 기능을 이용하여 생성한다.

2. 초기 화면에는 Gateway 아이콘만 화면에 보일 것이다.

3. 등록된 앱목록에서 앱을 디자인 영역으로 드래그 앤 드롭 기능을 이용하여 배치한다.

4. 프론트앤드 앱과 백엔드앱이 등록되어 있을 것이다.

5. 둘 다 화면에 배치한 후 앱 간의 네트워크 정보는 선으로 연결한다. 선을 연결할 때는 시작하는 앱을 Shift키를 누른 상태로 다른 앱으로 마우스를 이동한다.

6. 네트워크 연결 시에는 반드시 순서를 지켜야 하는데 Gateway를 통해 Registry에 등록되기 때문에 프론트앤드 앱과 Gateway를 연결해야 하고 Gateway와 백엔드 앱을 연결해야 한다. 

7. 서비스를 연결하는 경우 백엔드 앱을 통해 서비스를 연결해야 한다. 

8. 위의 과정을 통하면 마이크로서비스 구성이 완료된다.

   ![](https://github.com/startupcloudplatform/Sample-App-Tutorial/blob/master/images/msa_design.png)



### 마이크로서비스 조회

생성과정을 통해 마이크로서비스 구성이 완료되었다면 Deploying 까지 완료된 상태이다. 외부에 오픈 가능한 도메인을 사용했다면 웹사이트 URL를 통해 어디에서든지 접속이 가능하다.

마이크로서비스 상세 조회화면에는 아래와 같은 정보를 확인할 수 있다.

- App

  App 목록을 통해 접근 가능한 URL을 확인할 수 있다. 

  ![](https://github.com/startupcloudplatform/Sample-App-Tutorial/blob/master/images/appdesc.png)

- Service 

​       마이크로서비스에 포함된 모든 서비스 목록을 제공한다.

- App & Service

- Network

- App Rest API

  API 호출 테스트를 실행할 수 있다. 

  ![apitest](https://github.com/startupcloudplatform/Sample-App-Tutorial/blob/master/images/apitest.png)

- Gateway

- Registry

- Configuration

- App Logging

​      마이크로서비스로 구성된 앱의 로그 정보를 뷰어롤 통해 제공한다. 동시에 여러개의 앱의 로그를 볼 수도 있다.

![](https://github.com/startupcloudplatform/Sample-App-Tutorial/blob/master/images/applog.png)



### API 공개 설정

마이크로서비스 기반으로 개발된 앱을 다른 사용자에게 공유를 위해 공개 설정을 할 수 있다. 공개 설정은 프론트엔드 앱에 정의한 API 설정 정보 기반으로 공개된다. 프론트엔드 앱에 백엔드 앱 호출 API를 정의해야 한다. 

프론트엔드 앱 개발 시 Controller에 정의한 @GetMapping 정보가 공개된다. 

API 공개 구조는 다음과 같다. 

![](https://github.com/startupcloudplatform/Sample-App-Tutorial/blob/master/images/apisystem.png)

프론트앤드 앱에 @GetMapping 를 정의한다. 

```
@GetMapping("/api/sido")
    public @ResponseBody
```

```
@GetMapping("/api/sangho")
    public @ResponseBody
```

