# pizzasearch project
피자를 일주일에 한번 먹을 정도로 좋아하는 저는 프로젝트로 무언가를 만들려는 생각을 하자마자 피자로 첫프로젝트를 해야겠다고 생각했습니다.
토핑으로 피자를 서치하는 웹사이트이며 좋아요/싫어요 순 랭킹페이지 정도가 주요 기능으로 만들어져있습니다.

# 목차
 - [사용 기술](https://github.com/jungtaemin/pizzasearch#사용-기술)
 - [프로젝트 설계](https://github.com/jungtaemin/pizzasearch#프로젝트-설계)
 - [프로젝트를 시작하면서..](https://github.com/jungtaemin/pizzasearch#프로젝트를-시작하면서..)
 - [검색되는 피자종류](https://github.com/jungtaemin/pizzasearch#검색되는-피자종류)
 - [주요 기능](https://github.com/jungtaemin/pizzasearch#주요-기능)
 - [기능 구현에 실패해 대체된 기능](https://github.com/jungtaemin/pizzasearch#기능-구현에-실패해-대체된-기능)
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


# 검색되는 피자종류

![저장 db](https://user-images.githubusercontent.com/96284736/163291474-76033acf-3ac2-4e25-ac39-58eead463fe5.png)

- 피자스쿨,도미노피자,미스터피자,피자알볼로 4개 브랜드의 모든 피자가 DB에 저장되어있어 검색이가능합니다.

# 주요 기능

**토핑별로 나만의 피자 검색하기**

![주요기능2](https://user-images.githubusercontent.com/96284736/163291604-7ef7af15-43dc-4830-a2c3-35fceaed1059.png)

- 나만의 피자를 검색하기위한 여러 value값 controller에 보내기- 체크박스로 구현
- 나만의 피자검색기능 ex:내가 만약 새우와 파인애플을 체크하고 검색하기를 클릭하면 새우와 파인애플이 모두들어간 피자만 검색이된다.

**좋아요/싫어요 버튼 >>랭킹DB에 데이터저장**

![주요기능1](https://user-images.githubusercontent.com/96284736/163292464-f745df7c-9cdd-4ff4-ab0d-11de8332e3de.png)

- 버튼디자인: 피자가 맛있을때는 무난하게 하트버튼으로 맛없을때는 맛없어서 우웩한다는 그런느낌을 생각하며 디자인했습니다.
- 좋아요/싫어요 버튼을 클릭하면 DB에 좋아요/싫어요 가 누른 버튼에 해당되는 데이터를 1씩 증가하게 로직을 짰습니다.
- 
**피자랭킹페이지**
- 피자를 좋아요/싫어요 순으로 순위를 매겨 화면에 출력합니다.
- sql update문으로 DB에저장후 화면에 뿌릴때는 timeleaf를 사용하여 table태그 row열을 랭킹순으로 반복출력하게 로직을 짰습니다.

# 기능 구현에 실패해 대체된 기능

**페이징기능**
페이징 기능은 검색을 오랜시간했음에도 자바스크립트,jpa 로 구현하는방법정도만 보이거나 어려운방법밖에 나오지않아서 기능을 만드는데 시간내에 불가능하다고판단.
  
![기능5](https://user-images.githubusercontent.com/96284736/163297488-d19c8646-86f2-4cb4-8f4a-8301254ae7b4.PNG)
- 하지만 페이징기능이 없다면 페이지는 무한정 늘어날것입니다.이를 막기위해 다른방법을 찾았고 그것이 overflow 입니다.
- 테이블을 div로 감싼뒤 overflow 스타일을 사용하여 스크롤바를 사용.페이지가 무한정 늘어나는것을 막았습니다.











