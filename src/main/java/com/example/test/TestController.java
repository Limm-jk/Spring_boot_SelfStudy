package com.example.test;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController{

    // @RequestMapping("/home")

    // public String home(){
    //     return "index.html";
    // }
    @RequestMapping("/test")
    public ModelAndView test() throws Exception{
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("name", "limmjk");

        ArrayList<String> testList = new ArrayList<String>();
        testList.add("a");
        testList.add("b");
        testList.add("c");

        mav.addObject("list", testList);
        return mav;
    }

    // @ResponseBody
    // @RequestMapping("/valueTest")
    // public String valueTest(){
    //     String value = "테스트 String";
    //     return value;
    // }
}