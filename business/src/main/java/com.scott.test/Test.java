package com.scott.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by gst on 2016/3/28.
 */
@Controller
@RequestMapping("/test")
public class Test {
    @ResponseBody
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String test() {
        return "Hello World";
    }
}
