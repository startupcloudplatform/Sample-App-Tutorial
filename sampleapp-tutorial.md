​                                                




**목 차**

[클라우드 기반 창업 플랫폼 소개... 1](#_Toc7769151)

[PaaS-TA 소개... 1](#_Toc7769152)






# 클라우드 기반 창업 플랫폼 소개

개방형 클라우드 기반의 SW개발 지원 도구의 부족과 창업자(사업자)의 제품 상용화 지원의 필요성으로 이전 보다 더 풍부한 SW개발지원 서비스를 제공으로 클라우드 기반의 소프트웨어 개발 에 필요한 다양한 서비스를 제공하는 플랫폼이다. 이 플랫폼에는 다음과 같은 내용을 포함하고 있다. 

§ 오픈데이터API 게이트웨이 시스템 포털

공공기관 및 오픈API를 제공하는 각 부처 정보를 통합하여 포털로 제공하며 CKAN을 이용한 여러기관의 정보라도 한번의 신청만으로 승인과 사용이 가능하며 가장 많이 사용하는 인기API, 추천API와 같은 부가적인 기능도 제공하는 시스템이다.

§ 빅데이터, AI기반 상권분석 브로커   

개방형 클라우드(PaaS-TA) 기반의 빅데이터 서비스 브로커와 AI기반의 창업후보지역을 제공하는 서비스 브로커를 제공한다. PaaS-TA 3.0 기반으로 개발이 되었으며 빅데이터는 5종, AI 기반 상권분석 브로커는 2종의 어댑터를 제공한다.

\-       빅데이터 수집/저장/분석/가공/가시화(5종)

\-       AI기반 상권분석 추천모델생성/추천모델관리(2종)

§ 마이크로서비스 스튜디오 

개방형 클라우드 상에서 동작하는 마이크로서비스 기반 개발 시 마이크로서비스를 쉽게 구성할 수 있고 앱 간의 호출 관계를 비주얼 편집기를 통해 제공하고 개발된 마이크로서비스 앱에 정의된 API를 공개하고 사용할 수 있도록 구성되어 있다. 






## 시스템 구성도

창업 플랫폼의 시스템 구성도는 다음과 같다. 

   ![1556872564396](C:\Users\crosshan\AppData\Roaming\Typora\typora-user-images\1556872564396.png)

<창업 플랫폼 시스템 구성도>

 

## 시스템 요구사항

 

## 시작하기

창업 플랫폼은 창업 개발자를 위한 세가지의 서비스를 포함하고 있다. 오픈데이터API 게이트웨이 시스템은 PaaS-TA 상에서 제공되는 서비스는 아니기 때문에 언제 어디서나 구분없이 사용이 가능하다. 나머지 서비스 브로커와 마이크로서비스 스튜디오는 PaaS-TA 상에서 동작하기 때문에 사용하기 이전에 PaaS-TA 계정이 있는지 확인이 필요하다.








## PaaS-TA 사용하기

 PaaS-TA 는 정부에서 오픈소스 Cloud Foundry를 기반으로 개발한 한국형 개방형 클라우드 플랫폼이다. 2015년 PaaS-TA 1.0출시 이후 2018년 12월에 PaaS-TA 링귀니 버전이 출시되었다. 창업플랫폼에서는 PaaS-TA 3.0(Penne) 기준으로 제공한다. 보다 자세한 내용은 아래 링크를 통해 확인할 수 있다. 

<https://guide.paas-ta.kr/guide-3.5-penne#undefined-4>

   

# 창업 플랫폼 활용 튜토리얼

 

창업 플랫폼을 활용하여 앱을 개발하는 과정을 제공한다. 이 튜토리얼를 이용하기 위해서는 사전에 PaaS-TA 교육을 이수하기를 권장한다. 

창업 플랫폼에서는 각 기 다른 특성을 갖고 있는 서비스를 제공하기 때문에 필요 요소가 세가지를 다 만족해야 사용할 수 있는 것은 아니다. 오픈데이터API 게이트웨이 시스템 포털은 PaaS-TA 사용여부와 무관하게 이용이 가능하다. 빅데이터 서비스 브로커, AI기반 상권분석 브로커는 PaaS-TA를 이용하면서 이에 맞는 분야 개발을 하는 경우에는 PaaS-TA와 같이 사용할 수 있다. 

마이크로서비스 스튜디오의 경우에도 위에 언급한 두가지 서비스와 무관하게 PaaS-TA 상에서 개발하는 개발자가 마이크로서비스 기반으로 개발을 시도하는 경우에 사용이 가능하다. 

이와 같이, 창업 플랫폼은 각 기 다른 세가지 서비스를 제공하며 그들간의 종속성이 없다. 단, 서비스 브로커와 마이크로서비스는 PaaS-TA 상에서만 실행이 된다는 점을 알아야 한다. 

 

## 샘플 앱

창업 플랫폼에서 제공하고 있는 기능과 서비스를 이용하여 업종별 창업 지역을 찾아주는 웹사이트를 만들고자 한다.  창업 플랫폼의 핵심 지원 서비스인 오픈데이터API 포털을 이용하여 해당되는 API 정보를 가져오고 빅데이터서비스 브로커와 AI기반 상권분석 브로커를 이용하여 API로 호출된 정보를 저장/분석/가공과 같은 기능을 이용하여 필요한 정보를 제공하는 앱을 만든다.  *[본 샘플 앱 프로젝트는 마이크로서비스 기반으로 개발을 위해 앱을 여러개로 분할하여 개발을 수행한다. 여기에서는 프론트엔드앱과 백엔드앱 각각 1개씩 개별 개발하여 구축하는 순서로 설명한다]*



### 개발 환경 요구사항

| 요구사항     | 버전  |
| ------------ | ----- |
| AngularJS    |       |
| Java         | 1.8   |
| Spring Boot  | 1.5.9 |
| Spring Cloud | 1.6.1 |
| swagger API  | 2.0.0 |

###### Service Broker 요구사항

ankus service broker 

###### Open PaaS 요구사항

PaaS-TA 3.0(Penne)

<https://guide.paas-ta.kr/guide-3.5-penne>

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

\-       마이크로서비스 기반으로 앱 분할 및 아키텍처 구성



### 마이크로서비스 개요

\-       업무상의 기능 또는 역할을 하나의 기능 묶음으로 개발된 컴포넌트 → 한 가지의 역할만 수행  

\-       REST API 등을 통하여 서비스들의 기능을 제공하고 사용 

\-       데이터를 공유하지 않고 서비스 별로 독립적으로 가공하고 저장함

   

마이크로서비스 참조  - <http://microservices.io>



## 프론트엔드앱 개발 환경 구축하기

Eclipse version 4.1.0을 활용하여 개발을 진행한다. 



###  개발 요구사항

\-       AngularJS 1.0

\-       Java 1.8

\-       Spring Boot 1.5.9

\-       Spring Cloud 1.6.1

\-       swagger API 2.0

 

### SampleApp 프로젝트 생성[eclipse]

여기에서는 eclipse 4.10 버전을 이용하여 프로젝트 생성하는 방법을 설명한다. Eclipse에서 java project를 생성하고 JavaSE-1.8을 적용한다. 

![1557207618773](C:\Users\crosshan\AppData\Roaming\Typora\typora-user-images\1557207618773.png)

개발 환경 구축 시 JAVA 이외에도 Spring Boot, Spring cloud 등 dependency 정의 부분을 [pom.xml]()에 정의한다.

eclipse 소스코드 폴더 구조는 아래 그림과 같이 정의한다.  

![1557208120838](C:\Users\crosshan\AppData\Roaming\Typora\typora-user-images\1557208120838.png)

첫번째로 [pom.xml]()에 필수 체크 부분을 반드시 확인한다. [pom.xml]()에 정의할 내용을 마이크로서비스 스튜디오 사이트의 DOCS 메뉴를 통해서도 확인이 가능하다.

![1557208896699](C:\Users\crosshan\AppData\Roaming\Typora\typora-user-images\1557208896699.png)

​                                                  

```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.crossent.microservice</groupId>
    <artifactId>front</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <packaging>jar</packaging>

    <name>front</name>
    <description>Demo project for Spring Boot</description>

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

    <dependencies>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-config</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-eureka</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-feign</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger2</artifactId>
            <version>2.3.1</version>
        </dependency>
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger-ui</artifactId>
            <version>2.3.1</version>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>

        <!--<dependency>-->
        <!--<groupId>org.springframework.boot</groupId>-->
        <!--<artifactId>spring-boot-starter-cloud-connectors</artifactId>-->
        <!--</dependency>-->

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

        <!-- Json -->
        <dependency>
            <groupId>com.googlecode.json-simple</groupId>
            <artifactId>json-simple</artifactId>
            <version>1.1.1</version>
        </dependency>
        <!-- web -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
        </dependency>

        <!-- webjars -->
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>jquery</artifactId>
            <version>1.11.3</version>
        </dependency>
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>bootstrap</artifactId>
            <version>4.1.3</version>
        </dependency>
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>angularjs</artifactId>
            <version>1.7.7</version>
        </dependency>
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>angular-ui</artifactId>
            <version>0.4.0-2</version>
        </dependency>
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>jquery-ui</artifactId>
            <version>1.11.3</version>
        </dependency>
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.8.5</version>
        </dependency>
        <!-- end of webjars -->

    </dependencies>

    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>${spring-cloud.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>


</project>
```


