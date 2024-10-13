package com.example.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class controller {
 
 
    @RequestMapping("home")
    public static String hello()
    {
return "Hello from Home ";
    }
 
@GetMapping("calculation") // all value will be passed in url which is unsafe

public static String getMethodName(@RequestParam int num1, @RequestParam int num2) {
  int c = num1+ num2 ; //same varaible name as form input name 

    return "the result is "+ c;
}


@PostMapping("securec")
public static String postMethodName(@RequestParam int a, @RequestParam int b) {
    int c= a+b;
    return "secure way" +c;
}


    
}
