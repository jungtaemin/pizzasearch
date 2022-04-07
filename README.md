# pizzasearch project
피자 토핑으로 피자검색, 검색횟수로 순위서비스 구현예정

# 목차
 - [사용 기술](https://github.com/jungtaemin/pizzasearch#사용-기술)
 - [프로젝트 설계](https://github.com/jungtaemin/pizzasearch#프로젝트-설계)
 - [프로젝트를 시작하면서..](https://github.com/jungtaemin/pizzasearch#프로젝트를-시작하면서..)
 - [진행사항](https://github.com/jungtaemin/pizzasearch#진행사항)


# 사용 기술

**프레임워크 / 라이브러리**

- java 11 openjdk
- springboot
- maybatis

**Build tool**
- Gradle

**Data base**
- Oracle

**view**
- Thymeleaf
- Bootstrap 5
- html/css
- 직접그린 일러스트

**라이브러리**
- Lombok

# 프로젝트 설계
![프로젝트 설계](https://user-images.githubusercontent.com/96284736/162211966-560c8225-0dbf-4115-8f35-f5e5e47f8753.png)
**피자 서치 페이지 구현 예정**
- 이미지 버튼 5개구현(페페로니,고구마/포테이토,파인애플,고기,새우)
- 뒤로가기 버튼 
- 클릭시 cnt를 모아놓은 클래스에서 v++로 cnt를 한다.cnt에 있는 숫자를 ToppingCnt repository @update문을 사용해서 cnt를 올린다.

**피자서치페이지 >> 검색후화면 구현 예정**
- timpeleaf 의 th:each 를 사용해서 동적페이지로 토핑에 해당하는 피자들만 화면에 뿌려기
-  페이징기능

** 토핑랭킹 구현예정**
- repository에서 데이터를 가져와서 내림차순으로 정렬후 순서대로 화면에 뿌리기
- timeleaf th:each 사용예정

# 프로젝트를 시작하면서..

이 프로젝트는 스프링을 급하게 공부를 끝내고 무언가를 구현해보는 첫 프로젝트입니다.그래서 mvc패턴에 익숙해지기위함과 동시에 스프링 자체에 익숙하지않기 때문에 
전체적으로 완성도보다는 공부를 한다는 느낌으로 프로젝트를 진행하려합니다.

# 진행사항 
![마바연동](https://user-images.githubusercontent.com/96284736/162216192-5b47fef5-07f8-4715-a7b3-0734a5dee54b.PNG)
<2022-04-07 마이바티스로 db연동>

