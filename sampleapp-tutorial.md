​                                                



# **목 차**




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

[샘플앱 소스코드 다운로드](<https://github.com/startupcloudplatform/Sample-App-Tutorial>)

### 개발 환경 요구사항

| 요구사항     | 버전  |
| ------------ | ----- |
| AngularJS    |       |
| Java         | 1.8   |
| Spring Boot  | 1.5.9 |
| Spring Cloud | 1.6.1 |
| swagger API  | 2.0.0 |

- Service Broker 요구사항

​       ankus service broker 

- Open PaaS 요구사항

​      PaaS-TA 3.0(Penne)

<    https://guide.paas-ta.kr/guide-3.5-penne>

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

마이크로서비스 앱은 기존의 모놀리식 앱과 다른 개발 방식으로 비지니스 관점으로 보면 독깁적인 서비스 변경과 확장이 유용하고 의존성이 감소된다. 단점은 아키텍처 설곙와 비지니스 분석이 선행되어야 하며 설계의 난이도가 증가한다. 레거시 시스템과 연계에 어려움이 있을 수 있다. 

기술적 관점에서는 신속하고 독립적인 변경, 배포 및 확장에 효율적이며 Polyglot(다양한 언어) 개발이 가능하다. 단점으로는 분산시스템 인프라 구성, 확장 및 운영에 어려움이 따른다.  실제로 마이크로서비스 구성 및 개발 도구가 부재하고 수 많은 앱의 연결되기 때문에 복잡한 네트워크 및 환경 설정을 위해 자동화는 필수이다. 

기존의 모놀리식 앱을 마이크로서비스 단위로 전환 개발하는 프로젝트도 수행하지만 신규 개발에 적용하는 것이 더 적합하다. 



#### 마이크로서비스 특징

\-       업무상의 기능 또는 역할을 하나의 기능 묶음으로 개발된 컴포넌트 → 한 가지의 역할만 수행  

\-       REST API 등을 통하여 서비스들의 기능을 제공하고 사용 

\-       데이터를 공유하지 않고 서비스 별로 독립적으로 가공하고 저장함

   

마이크로서비스 참조  - <http://microservices.io>



## 샘플 앱 프로젝트 시작하기

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

![](https://github.com/startupcloudplatform/Sample-App-Tutorial/blob/master/images/eclipse-folder.png)



### 마이크로서비스 기반 앱 개발 필수 체크 항목

첫번째로 JAVA 버전 체크를 반드시 확인한다. [manifest.xml]()와 [pom.xml]()에 정의할 내용을 마이크로서비스 스튜디오 사이트의 DOCS 메뉴를 통해서도 확인이 가능하다.

![1557208896699](C:\Users\crosshan\AppData\Roaming\Typora\typora-user-images\1557208896699.png)

 

##### JAVA 필수 체크

JAVA: 1.8이상, Spring Boot: 1.5.13, Spring Cloud: Edgware.RELEASE

```
<parent>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-parent</artifactId>
  <version>1.5.13.RELEASE</version>
  <relativePath/>
</parent>
	
<properties>
  <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
  <java.version>1.8</java.version>
  <spring-cloud.version>Edgware.RELEASE</spring-cloud.version>
</properties>  
```

IDE 도구에서 제공하는 개발 환경을 위의 항목에 맞게 설정한다. 만약 JAVA 기본값이 버전이 다르다면 eclipse 는 Add Libraries.. 을 통해 JAVA 1.8을 추가한다.



##### manifest.xml 

```
---
applications:
  - name: front
    memory: 1G
    path: target/front-0.0.1-SNAPSHOT.jar
    env:
      msa: yes
```



##### pom.xml 

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



##### annotation 정의

java spring cloud 의 eureka 기능 사용과 rest api 명세를 위한 swagger 필수 annotation을 정의한다.

@EnableDiscoveryClient, @EnableCircuitBreaker, @EnableSwagger2

```
package com.example.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
                //requestMapping과 약속된 부븐
                .paths(PathSelectors.ant("/api/**"))
                .build();
    }
}
```



##### application.properties

src/main/resources/application.properties

```
spring.application.name=영문앱이름
```



### 업종 별 창업 지역 제공 기능

사용자가 창업을 원하는 업종과 원하는 위치, 제공하는 상권 정보를 선택하면 유지기간이 가장 긴 지역을 우선으로 제공한다. 유지기간이 가장 긴 지역 순으로 리스트에 보여주고 해당 지역을 선택하면 상권 정보와 지도에 해당 업종별 가게 정보를 보여주는 기능을 제공하는 사이트이다. 

마이크로서비스 기반으로 개발을 위해 위의 기능을 프론트영역과 백엔드 영역으로 분리하여 두개의 분리된 앱으로 개발한다. 

#### 창업지역API제공[백엔드앱]

[오픈데이터 API Gateway 시스템 포털 접속하기]()

 위 링크를 통해 포털 사이트를 접속하여 소상공인진흥공단에서 오픈한 상권API를 신청하고 승인을 받는다. 

 

#### 업종별 창업 지역 찾기[프론트앤드앱]

 백엔드앱을 통해 정의된 API를 호출하여 결과를 UI로 제공하고 사용자가 원하는 정보를 선택할 수 있는 화면을 
 제공하는 앱이다.   

소스경로 : src/main/java/com/example/sample

###### API 호출 정의(annotation)

- [App.java]()

 annotation을 정의한 java 파일

```
package com.example.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
                //requestMapping과 약속된 부분
                .paths(PathSelectors.ant("/api/**"))
                .build();
    }
}
```



- [AnkusResultInterface.java]()



```
package com.example.sample;

import java.util.List;

public interface AnkusResultInterface<T> {
    String getSuccess();
    void setSuccess(String success);

    String getMessage();
    void setMessage(String message);

    String getObj();
    void setObj(String obj);

    List<T> getList();
    void setList(List<T> list);
}
```



- [AnkusResultSangho.java]()



```
package com.example.sample;

import java.util.List;

class AnkusResultSangho implements AnkusResultInterface<Sangho> {
    private String success;
    private String message;
    private String obj;
    private List<Sangho> list;

    @Override
    public String getSuccess() {
        return success;
    }

    @Override
    public void setSuccess(String success) {
        this.success = success;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getObj() {
        return obj;
    }

    @Override
    public void setObj(String obj) {
        this.obj = obj;
    }

    @Override
    public List<Sangho> getList() {
        return list;
    }

    @Override
    public void setList(List<Sangho> list) {
        this.list = list;
    }
}
```



- [AnkusResultSido.java]()

백엔드앱의 API를 접속하여 시도 정보를 가져오는 클래스 

```
package com.example.sample;

import java.util.List;

class AnkusResultSido implements AnkusResultInterface<Dong> {
    private String success;
    private String message;
    private String obj;
    private List<Dong> list;

    @Override
    public String getSuccess() {
        return success;
    }

    @Override
    public void setSuccess(String success) {
        this.success = success;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getObj() {
        return obj;
    }

    @Override
    public void setObj(String obj) {
        this.obj = obj;
    }

    @Override
    public List<Dong> getList() {
        return list;
    }

    public void setList(List<Dong> list) {
        this.list = list;
    }
}
```



[Dong.java]()



```
package com.example.sample;

public class Dong {
    private Integer not_alivecnt;
    private Integer alivecnt;
    private Double months;
    private Integer cnt;
    String dong;
    private Double not_alive_ratio;

    public Integer getNot_alivecnt() {
        return not_alivecnt;
    }

    public void setNot_alivecnt(Integer not_alivecnt) {
        this.not_alivecnt = not_alivecnt;
    }

    public Integer getAlivecnt() {
        return alivecnt;
    }

    public void setAlivecnt(Integer alivecnt) {
        this.alivecnt = alivecnt;
    }

    public Double getMonths() {
        return months;
    }

    public void setMonths(Double months) {
        this.months = months;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    public String getDong() {
        return dong;
    }

    public void setDong(String dong) {
        this.dong = dong;
    }

    public Double getNot_alive_ratio() {
        return not_alive_ratio;
    }

    public void setNot_alive_ratio(Double not_alive_ratio) {
        this.not_alive_ratio = not_alive_ratio;
    }
}
```



[Sangho.java]()

ooooo

```
package com.example.sample;

class Sangho {
    private String bdong;
    private String address;
    private Double months;
    private String hdong;
    private String lng;
    private String alive;
    private String sangho;
    private String lat;

    public String getBdong() {
        return bdong;
    }

    public void setBdong(String bdong) {
        this.bdong = bdong;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getMonths() {
        return months;
    }

    public void setMonths(Double months) {
        this.months = months;
    }

    public String getHdong() {
        return hdong;
    }

    public void setHdong(String hdong) {
        this.hdong = hdong;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getAlive() {
        return alive;
    }

    public void setAlive(String alive) {
        this.alive = alive;
    }

    public String getSangho() {
        return sangho;
    }

    public void setSangho(String sangho) {
        this.sangho = sangho;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }
}
```



[TestController.java]()

oooo

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

import javax.annotation.PostConstruct;
import java.net.URI;
import java.util.*;

@RestController
@RefreshScope
public class TestController {

    @Autowired
    private RestTemplate searchClient;
    //마이크로서비스 config쪽에서 basic auth정보 가져오는 부분
    //spring aplication property 문법 참조
    @Value("${gateway.basic.user: }")
    String user;

    @Value("${gateway.basic.password:}")
    String password;

    Object responseReturn = null;
    //HttpHeader를 BasicAuth추가
    private HttpHeaders getHeaders(){
        String basicAuth = String.format("%s:%s", user, password);
        String base64Auth = Base64Utils.encodeToString(basicAuth.getBytes());

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", String.format("Basic %s", base64Auth));
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        return headers;
    }

    @GetMapping("/api/sido")
    public @ResponseBody
    Object callMain(
            @RequestParam(value="wantedAreaList") List<String> areaList,
            @RequestParam(value="wantedInfoList") List<String> infoList,
            @RequestParam(value="wantedBusiness") String business
    ) throws ParseException {
        System.out.println("request api/sido");
        //String testArea = areaList.get(0);
        try{
            HttpEntity request = new HttpEntity(getHeaders());
            URI uri = URI.create("http://apigateway/ankus-microservice/api/dong");

            List<Dong> totalList = new ArrayList<>();
            for(String testArea :areaList) {
                UriComponents requestUri = UriComponentsBuilder.fromHttpUrl(String.valueOf(uri)).
                        queryParam("sido", testArea).build().encode("UTF-8");

                System.out.println("===Uri==="+requestUri);
                postConstruct();
                ResponseEntity<AnkusResultSido> response = searchClient.exchange(requestUri.toUri(), HttpMethod.GET, request, AnkusResultSido.class);



                //api/sido 호출 이후 데이터 정리
                if(areaList.size() == 1) {
                    System.out.println("areaList size == 1");
                    responseReturn = response.getBody().getList().subList(16,26); //[0-9]
                    System.out.println("test not_alive_ratio" +
                            response.getBody().getList().subList(0,1).get(0).getNot_alive_ratio().toString());
                }
                else {
                    System.out.println("areaList size > 1");
                    totalList.addAll(response.getBody().getList().subList(0,3));
                    responseReturn = totalList;
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return responseReturn;
    }

    @GetMapping("/api/sangho")
    public @ResponseBody
    Object callMain(
            @RequestParam(value="wantedDong") String dong,
            @RequestParam(value="wantedBusiness") String business
    ) {
        System.out.println("request api/sangho");
        try {
            HttpEntity request = new HttpEntity(getHeaders());
            URI uri = URI.create("http://apigateway/ankus-microservice/api/sangho");
            UriComponents requestUriSangho = UriComponentsBuilder.fromHttpUrl(String.valueOf(uri)).
                        queryParam("dong", dong).
                        queryParam("upjong", business).build().encode("UTF-8");
            ResponseEntity<AnkusResultSangho> response = searchClient.exchange(requestUriSangho.toUri(), HttpMethod.GET, request, AnkusResultSangho.class);


            //api/sangho 호출 이후 데이터정리
            for (Sangho sg: response.getBody().getList()) {
                System.out.println("점포명: " + sg.getSangho() + "개월수: " + sg.getMonths());
            }
            responseReturn = response.getBody().getList();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return responseReturn;
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println(">>Basic Auth user/password: " + user + "/" + password);
    }
}
```

