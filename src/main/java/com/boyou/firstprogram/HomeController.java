package com.boyou.firstprogram;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    publice String homePage(){
        return "index";
    }


}
