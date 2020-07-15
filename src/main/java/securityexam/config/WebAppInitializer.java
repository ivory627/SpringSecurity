package securityexam.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.*;

//web.xml파일을 대신하는 자바 Config설정파일
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	//Spring Config 파일 설정
	@Override
	protected Class<?>[] getRootConfigClasses(){
		return new Class<?>[] {ApplicationConfig.class, SecurityConfig.class};
	}
	
	//Spring web config 파일 설정
	//WebConfig는 Bean을 RootConfig에서 설정한 곳에서부터 찾는다.
	@Override
	protected Class<?>[] getServletConfigClasses(){
		return new Class<?>[] {MvcConfig.class};
	}
	
	/*
    getServletMapping()은 DispatcherServlet이 매핑되기 위한 하나 혹은 여러 개의 패스를 지정한다.
   	이 코드에서는 애플리케이션 기본 서블릿인 /에만 매핑이 되어 있다. 그리고 이것은 애플리케이션으로 들어오는 모든 요청을 처리한다.
   	원래 서블릿에서는 / 을 처리하는 DefaultServlet이 설정되어 있다.
     */
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
	
	//필터 설정
	//DispatcherServlet 앞에 동작
	@Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		
		return new Filter[] {encodingFilter};
	}
}
