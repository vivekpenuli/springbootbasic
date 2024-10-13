package com.example.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class controller {
 
 
    @RequestMapping("home")
    public static String hello()
    {
return "Hello from Home ";
    }
    
@GetMapping("calculation")
public static String getMethodName(@RequestParam int num1, @RequestParam int num2) {
  //int c = a+b;

    return "the result is ";
}

    
}
