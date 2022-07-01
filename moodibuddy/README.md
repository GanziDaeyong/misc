# 설명
무디버디 서버입니다.    

# 기술 스택
프레임워크: Django Restful Framework (DRF)  
DB: PostgreSQL  
배포: AWS EC2, AWS RDS, GIT    

# 구현된 API
[POST] /diary/  
다이어리 만들기, 오늘 쓴 게 있다면 평균 내기, 처음이라면 경험치 주기  
[GET] /stats/weeklymood/  
주별 감정 평균을 조회.  
[GET] /stats/diary/?order={order} 혹은 /?date={date}  
다이어리 조회. 파라미터로 순서, 날짜 조회할 수 있음.  
*페이지네이션 적용됨.  
[GET] /duplicate/username/?username={username}  
유저id 중복조회  
[GET] /duplicate/nickname/?nickname={nickname}  
닉네임(유저명) 중복조회  
[POST] /email/verification/  
이메일 인증 - 이메일로 인증 코드 전송.  
[POST] /email/find_id/  
아이디 찾기 - 이메일로 아이디 전송.  
[POST] /email/find_pw/  
비밀번호 찾기 - 이메일로 난수로 변경된 비밀번호 전송  
[POST] /user/  
회원가입  
[PUT] /user/login/  
로그인  
[GET] /user/  
유저 리스트 받아오기 - 보안필요  
[PUT] /user/update/  
유저 정보 변경하기  
[POST] /userprofile/  
유저 프로필 생성하기 - 필요한가?  
[GET] /main/mainpage/  
메인페이지 정보 받아오기  
[POST] /main/quest/  
퀘스트 성공  
