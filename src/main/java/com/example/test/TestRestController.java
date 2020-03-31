package com.example.test;
//import com.god.bo.test.service.TestService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestRestController{

    @Autowired
    //TestService testservice;

    @RequestMapping(value ="/valueTest", method = RequestMethod.GET)
    public String valueTest(){
        String value = "레스트 컨트롤러 테스트";
        return value;
    }
}