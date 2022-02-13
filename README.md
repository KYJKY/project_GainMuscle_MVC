![main](https://user-images.githubusercontent.com/93513959/153731734-64723ed3-4704-44c2-ad16-98f28c255569.JPG)

## 📌 프로젝트 소개 (Project Introduction)
### 득근득근다이어리
- 사용자 맞춤형 다이어트 쇼핑몰 웹사이트
- 다이어트를 주제로 기본적인 다이어트 식품 쇼핑몰 구현 + 헬스케어 기능
- 사용자의 신체 스펙을 입력받고, 현재 몸상태에 적절한 칼로리, 탄수화물, 지방, 단백질에 대한 결과값을 출력


<br><br><br>
## ⏰ 개발 기간
- 2022.01.14~2022.01.27

<br><br><br>
## ⚙ 개발 환경(Development Environment)
### 🖥 OS version(platform)
- Windows 10
### ☕ JAVA 11.0.12 (JDK 1.8.0_221)
- Eclipse version(Development tool)
### 🛠︎ Tool
- Eclipse IDE for Enterprise Java Developers
- Visual Studio Code Version 1.41
### ☁ Server
- Tomcat 8.5
### 📊 DB, DBMS
- Oracle
- SQLDeveloper

<br><br><br>
## 📊 데이터 설계(ERD)
![erd](https://user-images.githubusercontent.com/93513959/153732167-8f155d43-2718-43a2-9391-246202db04aa.JPG)



## 🙋‍♂ 담당업무(Responsibilities)
- 헤더와 푸터가 포함된 템플릿 코드(컨트롤러, 뷰) 공유
- 관리자 페이지 구현
- 메인 페이지의 검색 기능 구현
- 아임포트 API를 통한 결제 API 구현

<br><br><br>
## 🖥 구현화면
### 유연한 관리자 검색기능 구현
![검색테스트](https://user-images.githubusercontent.com/93513959/153732782-e52b7e3e-0c51-418f-aff5-ade10d30f497.gif)
<br><br>
### 검색 페이지에서 즉시 사용자 정지 적용
![정지](https://user-images.githubusercontent.com/93513959/153732570-c9d05264-032d-4495-af06-3b3f74ae4164.gif)
<br><br>
### 검색 페이지에서 특정 사용자 상세정보 조회
![상세조회](https://user-images.githubusercontent.com/93513959/153732783-e4a352b6-6f1d-4a88-ac3b-900ab4a3b9fe.gif)
<br><br>
### 특정 사용자 상세보기에서 주문내역/문의내역/리뷰내역 조회
![상세조회탭](https://user-images.githubusercontent.com/93513959/153732784-293e8f65-365a-406f-aad0-7ad22ed0ae52.gif)
<br><br><br>
## 📝 개발후기
### \- 내가 얻은 것 -
- 기획의 중요성을 깨우침
- 구현에 필요한 API를 찾아서 공식 docs를 읽고, 적용하는 법을 터득함.
- DB의 중복과 정규화를 극대화하여 효율적인 DB설계를 하게 된 대신, 관리자 페이지를 구현하면서 업무Query를 작성할 때 매우 어렵게 된다는 사실을 알게됨.
- MVC패턴에 대한 이해도가 향상되었다.


### \- 어려웠던 것 -
- 프로젝트 주제 제시를 내가 했지만 웹 사이트 컨셉을 전달하는데 있어서 쉽게 공유가 안됐던 것 같다.
- 매우 느린 생산성1 > MVC패턴에 익숙하지 않기에 정말 많은 시간을 소모함.
- 매우 느린 생산성2 > 구현할 관리자 페이지의 업무 Query를 짜기 매우 어려운 구조였다.
- URL Mapping에 대한 이해 > JSP 상에서 URL과 servlet의 RequestDispatcher에서 URL, @WebServlet() 내의 URL 등 URL에 대한 완벽한 이해가 부족했던 것 같다.

<br><br><br>
