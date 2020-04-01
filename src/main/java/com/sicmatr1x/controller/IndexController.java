package com.sicmatr1x.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

  @RequestMapping("/test")
  public String test(Model model) {
    model.addAttribute("msg", "hello");
    return "test";
  }

//  @RequestMapping({"/", "/index.html"})
//  public String index(Model model) {
//    model.addAttribute("msg", "hello");
//    return "index";
//  }
}
