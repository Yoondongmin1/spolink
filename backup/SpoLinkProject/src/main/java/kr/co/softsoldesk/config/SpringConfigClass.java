package kr.co.softsoldesk.config;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringConfigClass implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext servletAppContext = new AnnotationConfigWebApplicationContext();
		servletAppContext.register(ServletAppContext.class);

		DispatcherServlet dispatcherServlet = new DispatcherServlet(servletAppContext);
		
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", dispatcherServlet);

		servlet.setLoadOnStartup(1); 
		servlet.addMapping("/"); 

		// =============================================================

		AnnotationConfigWebApplicationContext rootAppContext = new AnnotationConfigWebApplicationContext();
		rootAppContext.register(RootAppContext.class);

		ContextLoaderListener listener = new ContextLoaderListener(rootAppContext);
		servletContext.addListener(listener);
		// �峪�乱��� �ｰ懍�晤据�株 �擽�ｲ､孖ｸ �ｲ俯ｦｬ �└���

		// =============================================================

		FilterRegistration.Dynamic filter = servletContext.addFilter("encodingFilter", CharacterEncodingFilter.class);
		// 甯誤攵�ｯｸ奓ｰ �攤�ｽ罷畠 �└���
		filter.setInitParameter("encoding", "utf-8");
		filter.addMappingForServletNames(null, false, "dispatcher");

	}

}
