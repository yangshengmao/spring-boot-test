package com.hz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class Test {


     @RequestMapping("/user/account")
     @ResponseBody
     private String userAccount(){
          return "访问userAccount地址";
     }

     @RequestMapping("/user/login")
     @ResponseBody
     private String userLogin(){
          return "访问userLogin地址";
     }


     @RequestMapping("/query")
     @ResponseBody
     private String query(){
          return "访问query地址";
     }

}
