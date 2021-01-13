package com.smart.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author liujunhua
 * @date 2020/12/25 16:23
 * @description: DemoController
 */
@Controller
public class DemoController {

    @ResponseBody
    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String home() {
        return "Hello,World!";
    }

}