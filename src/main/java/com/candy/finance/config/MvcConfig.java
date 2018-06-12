package com.candy.finance.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author guoguo_lz@126.com
 * @Date 2018-05-31 下午 23:17
 */
@Configuration
public class MvcConfig  implements WebMvcConfigurer{
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("home");
//        registry.addViewController("/index").setViewName("index");
    }
}
