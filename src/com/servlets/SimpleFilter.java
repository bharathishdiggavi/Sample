package com.servlets;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SimpleFilter  implements javax.servlet.Filter {
	

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)arg0;
		HttpSession session = req.getSession(false);
		
		if(session!=null) {
			String name = arg0.getParameter("name");
			if(name!=null) {
				arg0.setAttribute("name",name );
				arg2.doFilter(arg0, arg1);
			} else {
				arg1.getWriter().print("please pass parameter...!!!");
			}
		} else {
			arg1.getWriter().print("invalid session...");
		}
		
		/*String name = arg0.getParameter("name");
		if(name!=null) {
			arg0.setAttribute("name",name );
			arg2.doFilter(arg0, arg1);
		} else {
			arg1.getWriter().print("please pass parameter...!!!");
		}*/
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
}
