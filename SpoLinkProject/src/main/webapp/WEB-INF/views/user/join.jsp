<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!-- 절대경로 -->
<c:set var="root" value="${pageContext.request.contextPath }/" />

<!DOCTYPE html>
<html style="font-size: 16px;" lang="en"><head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="​Join us">
    <meta name="description" content="">
    <title>join</title>
    <link rel="stylesheet" href="${root }css/nicepage.css" media="screen">
<link rel="stylesheet" href="${root }css/join.css" media="screen">
    <script class="u-script" type="text/javascript" src="${root }js/jquery-1.9.1.min.js" defer=""></script>
    <script class="u-script" type="text/javascript" src="${root }js/nicepage.js" defer=""></script>
    <meta name="generator" content="Nicepage 6.15.2, nicepage.com">
    <meta name="referrer" content="origin">
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i">
    <script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
<!-- 2024-08-09 -->
<!-- 카카오 SDK를 추가 -->
	<script>
        // 카카오 SDK 초기화
        Kakao.init('64d3e413591e4a5d7e3b0b66856f56a4');
	/* 김용민 */
        function loginWithKakao() {
            Kakao.Auth.login({
/*             	scope: 'profile_nickname,profile_image,email', // 필요한 권한 요청 설정
 */                
 				success: function(authObj) {
                    Kakao.API.request({
                        url: '/v2/user/me',
                        success: function(res) {
                            if (res.kakao_account && res.kakao_account.profile) {
                                var userInfo = {
                                    id: res.id,
                                    nickname: res.kakao_account.profile.nickname,
                                    email: res.kakao_account.email || "이메일 정보가 없습니다."
                                };
                                console.log(userInfo);
                                
                             // 리디렉션 구글로 빠지면 로그인 성공 (정보 가져옴 (ID, 닉네임))
							//window.location.href = "http://google.com"; // 여기에 원하는 페이지 URL을 입력하세요
								console.log("로그인 성공");
                                
                            } else {
                                console.log('Profile 정보가 제공되지 않았습니다.');
                                
                             
                            }
                        },
                        fail: function(error) {
                            console.log(error);
                        }
                    });
                },
                fail: function(err) {
                    alert(JSON.stringify(err));
                }
            });
        }

        
        // 카카오톡 연결 해제
        function unlinkWithKakao() {
            Kakao.API.request({
                url: '/v1/user/unlink',
                success: function(response) {
                    console.log(response);
                    alert('카카오톡과의 연결이 해제되었습니다.');
                    window.location.reload();
                },
                fail: function(error) {
                    console.log(error);
                    alert('연결 해제 중 오류가 발생했습니다.');
                }
            });
        }
    </script>


<script type="application/ld+json">{
		"@context": "http://schema.org",
		"@type": "Organization",
		"name": "",
		"logo": "/images/default-logo.png",
		"sameAs": []
}


</script>
    <meta name="theme-color" content="#2676c1">
    <meta property="og:title" content="join">
    <meta property="og:description" content="">
    <meta property="og:type" content="website">
  </head>
  <body data-path-to-root="/" data-include-products="false" class="u-body u-xl-mode" data-lang="en">
  
  
  <!-- 상단메뉴 -->
<c:import url="/WEB-INF/views/include/top_menu.jsp"></c:import>
    
    
    <section class="u-clearfix u-white u-section-1" id="carousel_f3f0">
      <div class="u-clearfix u-sheet u-valign-middle u-sheet-1">
        <div class="u-container-style u-group u-palette-1-light-1 u-preserve-proportions u-radius u-shape-round u-group-1">
          <div class="u-container-layout u-container-layout-1">
            <h2 class="u-align-center u-text u-text-default u-text-1"> Join us</h2>
            <h5 class="u-align-center u-text u-text-2"> Any questions or remarks? Just write us a message!</h5>
            <div class="u-form u-form-1">
              <form action="https://forms.nicepagesrv.com/v2/form/process" class="u-clearfix u-form-spacing-32 u-form-vertical u-inner-form" source="email" name="form" style="padding: 10px;">
                <div class="u-form-group u-label-none u-form-group-1">
                  <label for="text-9a47" class="u-label">Input</label>
                  <input type="text" id="text-9a47" name="아이디" class="u-grey-10 u-input u-input-rectangle u-radius u-input-1" placeholder="사용할 아이디를 입력해주세요." required="required">
                </div>
                <div class="u-form-group u-label-none u-form-group-2">
                  <label for="text-0cb7" class="u-label">Input</label>
                  <input type="text" placeholder="이름을 입력해주세요" id="text-0cb7" name="이름" class="u-grey-10 u-input u-input-rectangle u-radius u-input-2" required="required">
                </div>
                <div class="u-form-email u-form-group u-label-none">
                  <label for="email-bb9b" class="u-label">Email</label>
                  <input type="email" placeholder="이메일 주소를 입력해주세요" id="email-bb9b" name="이메일" class="u-grey-10 u-input u-input-rectangle u-radius-50" required="required">
                </div>
                <div class="u-form-group u-label-none u-form-group-4">
                  <label for="text-cd0a" class="u-label">Input</label>
                  <input type="text" placeholder="비밀번호를 입력해주세요" id="text-cd0a" name="비밀번호" class="u-grey-10 u-input u-input-rectangle u-radius u-input-4">
                </div>
                <div class="u-form-group u-label-none u-form-group-5">
                  <label for="text-7ad0" class="u-label">Input</label>
                  <input type="text" placeholder="비밀번호를 재입력해주세요" id="text-7ad0" name="text" class="u-grey-10 u-input u-input-rectangle u-radius u-input-5">
                </div>
                <div class="u-form-group u-form-phone u-label-none u-form-group-6">
                  <label for="text-d0df" class="u-label">Input</label>
                  <input type="tel" placeholder="전화번호를 입력해주세요" id="text-d0df" name="전화번호" class="u-grey-10 u-input u-input-rectangle u-radius u-input-6" required="required">
                </div>
                <div class="u-align-left u-form-group u-form-submit u-label-none">
                  <input type="submit" value="submit" class="u-form-control-hidden">
                  <a href="#" class="u-active-palette-5-dark-3 u-border-none u-btn u-btn-round u-btn-submit u-button-style u-hover-palette-5-dark-3 u-palette-1-base u-radius-50 u-btn-1"> Submit</a>
                </div>
                <div class="u-form-send-message u-form-send-success"> Thank you! Your message has been sent. </div>
                <div class="u-form-send-error u-form-send-message"> Unable to send your message. Please fix errors then try again. </div>
                <input type="hidden" value="" name="recaptchaResponse">
                <input type="hidden" name="formServices" value="ce6d5be1-2dc5-44c5-0841-c6dc20a6776f">
              </form>
            </div>
            <a href="#" class="u-border-none u-btn u-btn-round u-button-style u-hover-palette-1-base u-palette-1-base u-radius u-btn-2">중복 확인 </a>
            <p class="u-align-left u-text u-text-3">다른 서비스 계정으로 가입</p>
            <div class="u-clearfix u-group-elements u-group-elements-1">
              <a href="#" class="u-border-none u-btn u-btn-round u-button-style u-hover-palette-1-light-1 u-radius u-white u-btn-3"><span class="u-file-icon u-icon u-text-custom-color-5 u-icon-1"><img src="${root }images/pngwing.com-5436c437.png" alt=""></span>&nbsp;NAVER
              </a>
              <a href="#" class="u-align-center u-border-none u-btn u-btn-round u-button-style u-hover-palette-1-light-1 u-radius u-white u-btn-4"><span class="u-file-icon u-icon u-icon-2"><img src="${root }images/google_icon-removebg-preview.png" alt=""></span>&nbsp;Google
              </a>
              
              
              
              
              <!-- 카카오 API 작업 -->
              <%-- <a href="#" class="u-align-center u-border-none u-btn u-btn-round u-button-style u-hover-palette-1-light-1 u-radius u-white u-btn-5"><span class="u-file-icon u-icon u-icon-3"><img src="${root }images/pngwing.com__2_-removebg-preview.png" alt=""></span>&nbsp;Kakaotalk
              </a> --%>
              <a href="javascript:void(0);" onclick="loginWithKakao()" class="u-align-center u-border-none u-btn u-btn-round u-button-style u-hover-palette-1-light-1 u-radius u-white u-btn-5">
				    <span class="u-file-icon u-icon u-icon-3">
				        <img src="${root }images/pngwing.com__2_-removebg-preview.png" alt="">
				    </span>&nbsp;Kakaotalk
				</a>
            </div>
            
            <!-- 2024-08-09 -->
           	<!-- 카카오톡 연결 해제용 버튼 -->
            <!-- <button onclick="unlinkWithKakao()">카카오톡 연결 해제</button> -->
            
            
            
            
            <div class="u-clearfix u-group-elements u-group-elements-2">
              <p class="u-align-left u-text u-text-4">이미 회원 가입이 되​어있다면,</p>
              <a href="#" class="u-active-none u-border-3 u-border-no-left u-border-no-right u-border-no-top u-border-white u-btn u-btn-rectangle u-button-style u-hover-none u-none u-text-white u-btn-6">로그인 </a>
            </div>
          </div>
        </div>
      </div>
    </section>
    

	<!-- 하단정보 -->
	<c:import url="/WEB-INF/views/include/bottom_info.jsp" />


</body>
</html>