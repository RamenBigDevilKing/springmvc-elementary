package com.springmvc.controller;

import com.springmvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <h3>springmvc-started</h3>
 * <p>用户控制器</p>
 *
 * @author : Chengjie Zhang
 * @date : 2020-08-26 12:53
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testString")
    public String testString(Model model) {
        User user = new User();
        user.setUserName("张成杰");
        user.setSex("男");
        model.addAttribute("user",user);
        return "complete";
    }

    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request , HttpServletResponse response) throws  Exception {
        // 转发
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        // 重定向
//        response.sendRedirect(request.getContextPath() + "/pages/success.jsp");
        // 响应内容 设置编码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html,charset=UTF-8");
        // 写入内容
        response.getWriter().print("SpringMvc!!!");
    }
}
