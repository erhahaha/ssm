package com.how2java.controller;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.how2java.pojo.User;
import com.how2java.service.UserService;


/**
 * ���Ʋ�
 * @author Nocol
 *
 */

@Controller
@RequestMapping("/user")

public class UserController {
	//ע��Service
	@Autowired
	private UserService userService;

	@RequestMapping("regist")
	public String regist(User user,Model model){		
		System.out.println("�û�ע�᣺"+user.getName()+user.getPassword());		
		user.setId(1);
		userService.regist(user);		
		model.addAttribute("msg", "ע��ɹ�");

		//ע��ɹ�����תsuccess.jspҳ��
		return "success";
	}
   
	

	@RequestMapping("/login")
	public String checkLogin(User user, Model model, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		System.out.println("username:"+user.getName());
		// ����service����
		user = userService.checkLogin(user.getName(), user.getPassword());
		// ����user����ӵ�model�ﲢ����ת���ɹ�ҳ��
		if (user != null) {
			// model.addAttribute("user",user);
			request.getSession().setAttribute("user", user);
			request.getSession().setAttribute("loginflag", "success");
			request.getSession().setAttribute("userid", user.getId());
			//return "sectionElementshow";
			System.out.println("222true");
			System.out.println("user:"+user.toString());
			return "success";
			// request.getRequestDispatcher("/WEB-INF/jsp/sectionElementshow.jsp").forward(request,
			// response);
		} else {
			//out.print("<script language='JavaScript'>alert('�û������������');</script>");
			request.getSession().setAttribute("loginflag", "fail");
			response.sendRedirect(request.getContextPath() + "/login.jsp");
			System.out.println("111false");
			return null;
		}

	}


}

