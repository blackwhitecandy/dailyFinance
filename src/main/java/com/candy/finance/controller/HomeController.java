package com.candy.finance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author guoguo_lz@126.com
 * @Date 2018-06-02 上午 9:50
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/home")
    public String toHome() {
        return "home";
    }

    @RequestMapping(value = "/")
    public String defaultPage() {
        return "home";
    }
}
