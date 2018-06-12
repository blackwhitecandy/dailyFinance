package com.candy.finance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author guoguo_lz@126.com
 * @Date 2018-05-31 下午 22:39
 */
@Controller
public class LoginController {
    @RequestMapping(value = "/login")
    public String toLogin() {
        return "login";
    }

}
