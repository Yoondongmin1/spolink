<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- 절대경로 -->
<c:set var="root" value="${pageContext.request.contextPath }/" />
<!-- 여기 -->
<!-- 상단 메뉴 부분 -->
  <header class="u-clearfix u-custom-color-1 u-header" id="sec-bc47" data-animation-name="" data-animation-duration="0" data-animation-delay="0" data-animation-direction=""><div class="u-clearfix u-sheet u-valign-middle u-sheet-1">
        <a href="#" class="u-align-center u-image u-logo u-image-1">
          <img src="${root }images/default-logo.png" class="u-logo-image u-logo-image-1">
        </a>
        <a href="#" class="u-border-none u-btn u-btn-round u-button-style u-grey-10 u-radius u-btn-1">Login </a>
        <a href="#" class="u-btn u-btn-round u-button-style u-radius u-btn-2">Join </a>
        <nav class="u-align-center u-dropdown-icon u-menu u-menu-dropdown u-offcanvas u-menu-1" data-responsive-from="MD" data-position="">
          <div class="menu-collapse" style="font-size: 1rem; letter-spacing: 0px; font-weight: 700;">
            <a class="u-button-style u-custom-active-border-color u-custom-active-color u-custom-border u-custom-border-color u-custom-border-radius u-custom-borders u-custom-color u-custom-custom-border-radius u-custom-effect-duration u-custom-hover-border-color u-custom-hover-color u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-text-active-color u-custom-text-color u-custom-text-decoration u-custom-text-hover-color u-custom-text-shadow u-custom-text-shadow-blur u-custom-text-shadow-color u-custom-text-shadow-transparency u-custom-text-shadow-x u-custom-text-shadow-y u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base" href="#">
              <svg class="u-svg-link" viewBox="0 0 24 24"><use xlink:href="#svg-8c98"></use></svg>
              <svg class="u-svg-content" version="1.1" id="svg-8c98" viewBox="0 0 16 16" x="0px" y="0px" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns="http://www.w3.org/2000/svg"><g><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
</g></svg>
            </a>
          </div>
          <div class="u-custom-menu u-nav-container">
            <ul class="u-nav u-spacing-20 u-unstyled u-nav-1">
            <li class="u-nav-item">
            <a class="u-active-custom-color-8 u-border-2 u-border-active-palette-1-base u-border-hover-palette-1-base u-button-style u-custom-color-1 u-hover-custom-color-8 u-nav-link u-text-active-white u-text-hover-white" href="#" style="padding: 50px 20px;">대회정보</a>
            <div class="u-nav-popup">
            <ul class="u-h-spacing-20 u-nav u-unstyled u-v-spacing-10 u-nav-2">
            <li class="u-nav-item">
            <a class="u-active-palette-1-dark-1 u-button-style u-custom-color-1 u-hover-palette-1-dark-1 u-nav-link">대회 일정</a>
</li><li class="u-nav-item"><a class="u-active-palette-1-dark-1 u-button-style u-custom-color-1 u-hover-palette-1-dark-1 u-nav-link">대회 상세 정보</a>
</li></ul>
</div>
</li><li class="u-nav-item"><a class="u-active-custom-color-8 u-border-2 u-border-active-palette-1-base u-border-hover-palette-1-base u-button-style u-custom-color-1 u-hover-custom-color-8 u-nav-link u-text-active-white u-text-hover-white" href="#" style="padding: 50px 20px;">용병등록</a>
</li><li class="u-nav-item"><a class="u-active-custom-color-8 u-border-2 u-border-active-palette-1-base u-border-hover-palette-1-base u-button-style u-custom-color-1 u-hover-custom-color-8 u-nav-link u-text-active-white u-text-hover-white" href="#" style="padding: 50px 20px;">자원봉사자</a>
</li><li class="u-nav-item"><a class="u-active-custom-color-8 u-border-2 u-border-active-palette-1-base u-border-hover-palette-1-base u-button-style u-custom-color-1 u-hover-custom-color-8 u-nav-link u-text-active-white u-text-hover-white" href="/" style="padding: 50px 20px;">팀/팀원 등록</a>
</li><li class="u-nav-item"><a class="u-active-custom-color-8 u-border-2 u-border-active-palette-1-base u-border-hover-palette-1-base u-button-style u-custom-color-1 u-hover-custom-color-8 u-nav-link u-text-active-white u-text-hover-white" style="padding: 50px 20px;">대회 등록</a>
</li><li class="u-nav-item"><a class="u-active-custom-color-8 u-border-2 u-border-active-palette-1-base u-border-hover-palette-1-base u-button-style u-custom-color-1 u-hover-custom-color-8 u-nav-link u-text-active-white u-text-hover-white" style="padding: 50px 20px;">이용안내</a>
</li></ul>
          </div>
          <div class="u-custom-menu u-nav-container-collapse">
            <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
              <div class="u-inner-container-layout u-sidenav-overflow">
                <div class="u-menu-close"></div>
                <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-3"><li class="u-nav-item"><a class="u-button-style u-nav-link" href="#">대회정보</a><div class="u-nav-popup"><ul class="u-h-spacing-20 u-nav u-unstyled u-v-spacing-10 u-nav-4"><li class="u-nav-item"><a class="u-button-style u-custom-color-1 u-nav-link">대회 일정</a>
</li><li class="u-nav-item"><a class="u-button-style u-custom-color-1 u-nav-link">대회 상세 정보</a>
</li></ul>
</div>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="#">용병등록</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="#">자원봉사자</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link" href="/">팀/팀원 등록</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link">대회 등록</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link">이용안내</a>
</li></ul>
              </div>
            </div>
            
          </div>
        </nav>
      </div>
      </header>
       
     