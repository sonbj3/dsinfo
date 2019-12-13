package jun.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.LoginVO;
import egovframework.let.uat.uia.service.EgovLoginService;
import jun.dao.MemberDAO;
import jun.service.MemberService;
import jun.vo.MemberBean;

@Controller
public class MemberController {
	private static final Logger LOGGER = LoggerFactory.getLogger(MemberController.class);

//	@Autowired
//	MemberService service;
	@Resource(name = "service")
	private MemberService service;
	
	@RequestMapping(value = "/member/joinForm.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String join(MemberBean mb) {
		System.out.println("join");
		service.insert(mb);  
		return "/member/joinForm";
	}

	@RequestMapping(value = "/member/loginForm.do")
	public String loginV(@ModelAttribute("memberBean") MemberBean memberBean, HttpServletRequest request, HttpServletResponse response, ModelMap model) throws Exception {
		System.out.println("ee");
		
		return "/member/loginForm";
	}
	@RequestMapping(value = "/member/actionLogin.do")
	public String memberLogin(@ModelAttribute("memberBean") MemberBean memberBean, HttpServletRequest request, ModelMap model) throws Exception {
		System.out.println("controller");
		System.out.println("아이"+memberBean.getId());
		System.out.println("비번"+memberBean.getId());
		// 1. 일반 로그인 처리
		MemberBean mb2 = service.actionLogin(memberBean);

		if (mb2 != null && mb2.getId() != null && !mb2.getId().equals("")){
			System.out.println("로그인 id : " + mb2.getId());
			return "redirect:/cmm/main/mainPage.do";
		} else {
			model.addAttribute("message", "실페");
			return "/member/loginForm";
		} 

	}
//	@RequestMapping(value = "/member/loginForm.do", method = {RequestMethod.GET, RequestMethod.POST})
//	public String login(MemberBean mb, HttpServletRequest request, HttpSession session) { 
//		System.out.println("login");
		
//		MemberBean mb2 = service.userCheck(mb);
//		if(mb2 != null){
//			System.out.println("mb2");
//			session.setAttribute("id", mb.getId());
//			return "/member/joinForm";
//		}else {
//			System.out.println("tttt");
			 
//		}
//	return "/member/loginForm";   
//	}
//	 @RequestMapping(value = "/jun/login.do" , method = RequestMethod.POST)
//	 public String memberInfo(Model model, HttpServletRequest request) {
//	 LOGGER.info("id = " + request.getParameter("id"));
//	 LOGGER.info("id = " + request.getParameter("password"));
//	
//	 String id = request.getParameter("id");
//	 String pw = request.getParameter("password");
//	 HashMap<String, String> map = new HashMap<String, String>();
//	 map.put("id", id);
//	 map.put("pw", pw); 
//	 service.selectUserInfo(map);
//	 return "/member/joinForm";
//	 }

}
