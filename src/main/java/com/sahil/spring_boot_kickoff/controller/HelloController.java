package com.sahil.spring_boot_kickoff.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HelloController{
    @GetMapping("/hello")
    public String sayHello(){

        return "Hello Sahil";
    }
//    @PostMapping("/hello")  --for simple string format out put
//    public String sayHelloPost(@RequestBody Map<String, String> body){
//        System.out.println("Received JSON:" +body);
//        return "Hello " + body.get("message");
//    }


//    for JSON format output
    @PostMapping("/hello")
    public Map<String, String> sayHelloPost(@RequestBody Map<String, String> body) {
        System.out.println("Received JSON: " + body);
        return Map.of("message", "Hello " + body.get("message"));
    }

}

