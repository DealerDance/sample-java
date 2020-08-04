package com.example.samplejava.controller;

import com.example.samplejava.common.ResultObject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/say")
    public ResultObject<String> sayHello() {
        String data = "hello world!";
        return ResultObject.instance(ResultObject.SUCCESS, data);
    }

    @PostMapping("/error")
    public ResultObject<Object> error() {
        String message = "error!";
        return ResultObject.error(message);
    }
}