package com.macro.mall.tiny;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.macro.mall.tiny.mapper")
//@ComponentScan("com.*.*.*")
@MapperScan({"com.gitee.sunchenbin.mybatis.actable.dao.*"})//固定的
@ComponentScan("com.gitee.sunchenbin.mybatis.actable.manager.*")//固定的
public class MallTinyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallTinyApplication.class, args);
    }

}
