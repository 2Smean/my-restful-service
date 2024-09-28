package org.hi.myrestfulservice.controller;

import jakarta.servlet.Servlet;
import org.hi.myrestfulservice.bean.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // GET
    // URI - /hello-world
    // @RequestMapping(method=RequestMethod.GET, path="/hello-world")
    // 문자열 데이터
    @GetMapping(path = "/hello-world")
    public String helloworld() {
        return "Hello World";
    }

    // 객체 형태로 JSON file 로 전달됨을 알 수 있음
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloworldBean() {
        return new HelloWorldBean("Hello World");
    }
}
