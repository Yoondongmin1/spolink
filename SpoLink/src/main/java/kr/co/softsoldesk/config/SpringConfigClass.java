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
// WebApplicationInitializer : web.xml �螺�擽 �梵�ｰ� 增ｴ�椈�侃�･ｼ 奝ｵ﨑ｴ �峪 �腹嵓誤ｦｬ�ｼ��擽��� �└��� ( �亨�梠 �亨 �ｰ��棗 �ｨｼ��� �梵�徐�共嵂� !! )

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext servletAppContext = new AnnotationConfigWebApplicationContext();
		servletAppContext.register(ServletAppContext.class);

		DispatcherServlet dispatcherServlet = new DispatcherServlet(servletAppContext);
		// DispatcherServlet : �囈�ｲｭ �ｰ懍�� �亨 �囈�ｲｭ�揆 �ｲ俯ｦｬ﨑俯株 ��罹ｸ罷ｦｿ�揆 DispatcherServlet�｡� �└���
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", dispatcherServlet);

		servlet.setLoadOnStartup(1); // ��罹ｸ罷ｦｿ�攪 �｡罹糖��懍�� (�ｪ� �ｲ溢ｧｸ�乱 �亨�梠﨑� �ｱｴ�ｧ�)
		servlet.addMapping("/"); // �ｪｨ�蕩 �囈�ｲｭ�揆 﨑ｴ�胸 ��罹ｸ罷ｦｿ�擽 �ｲ俯ｦｬ

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
