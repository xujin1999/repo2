package atguigu.lol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class Hello {
  @RequestMapping("/hello")
  public String hello(){
    return "success";
  }
//  @RequestMapping({"/","/index.html"})
//  public String login(){
//    return "login";
//  }

  @PostMapping("/user/login")
  public String login(@RequestParam("username") String username,
                      @RequestParam("password") String password,
                      Map<String,Object> map){
    if(!StringUtils.isEmpty(username)&&"123456".equals(password))
      return "redirect:/main.html";
    else {
      map.put("msg", "用户名与密码不符");
      return "/login.html";
    }
  }
}
