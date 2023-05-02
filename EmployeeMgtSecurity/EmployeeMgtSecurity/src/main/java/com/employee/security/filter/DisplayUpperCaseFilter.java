package com.employee.security.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class DisplayUpperCaseFilter extends OncePerRequestFilter{

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
	
		 HttpServletRequestWrapper requestWrapper = new UppercaseQueryParamHttpServletRequestWrapper(request);
		 filterChain.doFilter(requestWrapper, response);
	}

	
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		
//		String Fname=request.getParameter("name");
//		
//		request.setAttribute("name", Fname.toUpperCase());
//		
//		System.out.println(Fname);
//		chain.doFilter(request, response);
//		
//	}

	
}
