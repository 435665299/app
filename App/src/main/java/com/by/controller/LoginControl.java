package com.by.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.by.entity.DevUser;
import com.by.service.UserService;
import com.by.utils.RegUtils;

@Controller
public class LoginControl {
	@Autowired
	private UserService userService;
	
	/**
	 * ��¼����
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/devLogin.do",method=RequestMethod.POST)
	public String doLogin(HttpServletRequest request,HttpServletResponse response){
		String devCode = request.getParameter("devCode");
		String devPassword = request.getParameter("devPassword");
		try {
			PrintWriter out =  response.getWriter();
			if(RegUtils.StrisNull(devCode)){
				String error = "�û�������Ϊ��";
				request.setAttribute("error", error);
				return "forward:/jsp/login.jsp";
			}
			if(RegUtils.StrisNull(devPassword)){
				String error = "���벻��Ϊ��";
				request.setAttribute("error", error);
				return "forward:/jsp/login.jsp";
			}
		    DevUser user = userService.selectUser(devCode);
		    if(user == null || user.getDevPassword().equals(devPassword)==false){
				String error = "�û��������벻��ȷ";
				request.setAttribute("error", error);
		    	return "forward:/jsp/login.jsp";
		    }
		    request.getSession().setAttribute("user", user);
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "404";
		}
		return "/pre/index1";		
	}
	
	/**
	 * ������ҳ
	 * @return
	 */
	@RequestMapping(value="/home")
	public String homeIndex(){
		return "home";		
	}
	
	/**
	 * ע������
	 * 
	 */
	@RequestMapping(value="/login.out")
	public String loginOut(HttpServletRequest request,HttpServletResponse response){
		request.getSession().removeAttribute("user");
		return "login";		
	}
	
}
