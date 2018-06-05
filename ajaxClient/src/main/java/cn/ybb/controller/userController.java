package cn.ybb.controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.ybb.entity.User;
import cn.ybb.service.UserService;

@Controller
@RequestMapping("/user")
public class userController {
	@Resource
	private UserService userService;
	
	/**
	 * ҳ����ת
	 * @param type
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/point")
	public String pointJSP(@PathVariable String type,HttpServletRequest request,HttpServletResponse response){
		if("insert".equals(type)){
			return "insert";
		}
		if("modify".equals(type)){
			return "modify";
		}
		return "redirect:index.jsp";//�ض���
	}
	
	
	/**
	 * ��ѯ
	 * @param request
	 * @return
	 */
	@RequestMapping("/findUser")
	public String findUser(@PathVariable String name,HttpServletRequest request){
		List<User> users = null;
		try {
			users = userService.findUser(name,request);
			request.setAttribute("users", users);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "findUser";
	}


	/**
	 * ����
	 * @param user
	 * @param request
	 * @return
	 */
	@RequestMapping("/insert")
	public void insertUser(User user,HttpServletRequest request,HttpServletResponse response){
		PrintWriter out = null;
		try {
			out = response.getWriter();
			userService.insertUser(user, request);
			out.print("���ӳɹ�");
		} catch (Exception e) {
			e.printStackTrace();
			out.print("����ʧ��");
		}finally{
			if(out!=null){
				out.close();
			}
		}
	}
	/**
	 * �޸�
	 * @param user
	 * @param request
	 * @return
	 */
	@RequestMapping("/modify")
	public void modifyById(User user,HttpServletRequest request,HttpServletResponse response){
		PrintWriter out = null;
		try {
			out = response.getWriter();
			userService.updateById(user);
			out.print("���³ɹ�");
		} catch (Exception e) {
			e.printStackTrace();
			out.print("����ʧ��");
		}finally{
			if(out!=null){
				out.close();
			}
		}
	}
	/**
	 * ɾ��
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/delete")
	public void deleteById(int id,HttpServletRequest request,HttpServletResponse response){
		PrintWriter out = null;
		try {
			out = response.getWriter();
			userService.deleteById(id);
			out.print("ɾ���ɹ�");
		} catch (Exception e) {
			e.printStackTrace();
			out.print("ɾ��ʧ��");
		}finally{
			if(out != null){
				out.close();
			}
		}
	}
	

}
