package com.lbbzcy.personalwebsite.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @FileName: MainController.java
 * @Description: MainController.java类说明
 * @Author: chunyu
 * @Date: 17-10-25 下午10:27
 */
@RestController
public class MainController {
    @RequestMapping(value = {"/","/index"})
    public ModelAndView Main(){
        return new ModelAndView("index");
    }
}
