package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PACKAGE     : com.example.demo
 * CREATE DATE : 2018-05-07
 * AUTHOR      : shouhan
 * 文件描述     : jenkins测试项目
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("test")
    public String test() {
        System.out.println("docker的例子，哈哈哈哈哈");
        return "docker的例子，哈哈哈哈哈";
    }

}
