package com.example.demo.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {

	@Bean
	public RemoteIpFilter remoteIpFilter() {
		return new RemoteIpFilter();
	}
	
	@Bean
	public FilterRegistrationBean<Filter> testFilterRegistration() {
		FilterRegistrationBean<Filter> filterReg = new FilterRegistrationBean<>();
		filterReg.setFilter(new MyFilter());
		filterReg.addUrlPatterns("/fk");
		filterReg.addInitParameter("paraName", "paraValue");
		filterReg.setOrder(1);
		filterReg.setName("MyFilter");
		return filterReg;
	}
	
	
	public class MyFilter implements Filter{

		@Override
		public void destroy() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
				throws IOException, ServletException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void init(FilterConfig arg0) throws ServletException {
			// TODO Auto-generated method stub
			
		}
		
	}
}
