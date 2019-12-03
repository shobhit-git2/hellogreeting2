package com.ibm.HelloGreeting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {

    @RequestMapping(path="/greeting2", method= RequestMethod.GET)
    public String sayHi(@RequestParam String name){
    String message = "Bye"+" "+name;
    return message;
    }
}
