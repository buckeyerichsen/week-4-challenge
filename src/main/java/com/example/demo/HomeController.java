package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "page1";}

    @RequestMapping("/page1")
    public String profile(){
        return "/page1";
    }

    @RequestMapping("/page2")
    public String profile2(){
        return "page2";
    }

    @RequestMapping("/page3")
    public String profile3(){
        return "page3";
    }

    @RequestMapping("/page4")
    public String profile4(){
        return "page4";
    }

    @RequestMapping("/page5")
    public String profile5(){
        return "page5";
    }

    @RequestMapping("/page6")
    public String profile6(){
        return "page6";
    }
}
