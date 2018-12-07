package com.binglian.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建作者:冰怜
 * 创建时间:2018/10/24 16:17
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        return "hello binglian!";
    }
}
