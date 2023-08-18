package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.pojo.Test;
import com.macro.mall.tiny.service.TestServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

//    private final TestServiceImpl testService;
//
//    @GetMapping("/hello")
//    public Object hello() {
//        return "hello";
//    }
//
//    @GetMapping("/save")
//    public Object save() {
//        Test test = new Test();
//        test.setName("caocao");
//        testService.save(test);
//        return test;
//    }
//
//    @GetMapping("/list")
//    public Object list() {
//        List<Test> list = testService.list();
//        return list;
//    }
}

