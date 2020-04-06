package com.example.test;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//import com.god.bo.test.service.TestService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class TestRestController{

    @Autowired
    //TestService testservice;

    @GetMapping(path = "/home")
    public String home(){
        return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }
}