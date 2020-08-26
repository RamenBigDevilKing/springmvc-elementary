package com.springmvc.controller;

import com.springmvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Map;

/**
 * <h3>springmvc-started</h3>
 * <p></p>
 *
 * @author : Chengjie Zhang
 * @date : 2020-08-13 12:53
 **/
@Controller
@RequestMapping("/param")
@SessionAttributes(value={"1"})
public class ParamController {

    /**
     * 测试带参数方法
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/testParam")
    public String testParam(String username,String password){
        System.out.println("用户名:" + username);
        System.out.println("密码:" + password);
        return "success";
    }

    /**
     * 测试Rest请求Put
     * @param id
     * @return
     */
    @RequestMapping(value = "/testPathVariable/{sid}",method = RequestMethod.PUT)
    public String testPathVariable(@PathVariable(name = "sid") String id){
        System.out.println("id:" + id);
        return "success";
    }

    /**
     * 测试请求头方法
     * @param header
     * @return
     */
    @RequestMapping(value = "/testRequestHeader",method = RequestMethod.GET)
    public String testRequestHeader(@RequestHeader(name = "Accept") String header){
        System.out.println("header:" + header);
        return "success";
    }

    /**
     * 测试Cookie请求
     * @return
     */
    @RequestMapping(value = "/testCookieValue",method = RequestMethod.GET)
    public String testCookieValue(@CookieValue(name = "JSESSIONID")String cookieValue){
        System.out.println(cookieValue);
        return "success";
    }


    /**
     * 测试ModelAttribute
     * @return
     */
    @RequestMapping(value = "/testModelAttribute",method = RequestMethod.POST)
    public String testModelAttribute(@ModelAttribute("uuu") User user){
        System.out.println(user);
        return "success";
    }

    /*@ModelAttribute
    public User requestTestModelAttributeBefoce(String userName){
        User user = new User();
        user.setUserName(userName);
        user.setAge("111");
        user.setPassowrd("222");
        user.setSex("333");
        return user;
    }*/

    @ModelAttribute
    public void requestTestModelAttributeBefoce(String userName , Map<String,User> map){
        User user = new User();
        user.setUserName(userName);
        user.setAge("111");
        user.setPassowrd("222");
        user.setSex("333");
        map.put("uuu",user);
    }

    /**
     * 测试GetSession
     * @return
     */
    @RequestMapping(value = "/testSetSession",method = RequestMethod.GET)
    public String testSetSession(Model model){
        model.addAttribute("1","测试");
        return "success";
    }

    /**
     * 测试GetSession
     * @return
     */
    @RequestMapping(value = "/testGetSession",method = RequestMethod.GET)
    public String testGetSession(ModelMap model){
        String val = (String)model.get("1");
        System.out.println("val:" + val);
        return "success";
    }

    /**
     * 测试testDeleteSession
     * @return
     */
    @RequestMapping(value = "/testDeleteSession",method = RequestMethod.GET)
    public String testDeleteSession(SessionStatus status){
        status.setComplete();
        return "success";
    }

}
