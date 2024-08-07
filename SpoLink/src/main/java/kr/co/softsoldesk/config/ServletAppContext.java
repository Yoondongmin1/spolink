package kr.co.softsoldesk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc // 컨트롤러라고 명시한 걸 끌고옴 (컨트롤러로 쓰겠다는 걸 알아보기 위함)
@ComponentScan("kr.co.softsoldesk.controller")
public class ServletAppContext implements WebMvcConfigurer {

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
//		Spring MVC 프로젝트 설정 인터페이스(없어도 굴러는 감, 입맛대로 맞추기용)
//		Controller의 메서드가 반환하는 JSP 의 이름 앞/뒤에 경로와 확장자를 붙여주는 메서드

		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");
//		일단 요청이 들어오면 이 파일 뒤져봐! (WEB-INF 안에 넣는게 보안이 뛰어남)
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/WEB-INF/resource/");
	}
	
	

}
