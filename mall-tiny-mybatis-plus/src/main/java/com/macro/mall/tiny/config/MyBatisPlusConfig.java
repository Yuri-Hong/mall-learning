package com.macro.mall.tiny.config;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.baomidou.mybatisplus.generator.AutoGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
//@Configuration
//@MapperScan({"com.macro.mall.tiny.mapper"})
//public class MyBatisPlusConfig {
//    @Bean
//    public AutoGenerator autoGenerator() {
//        AutoGenerator mpg = new AutoGenerator();
//// 数据源配置
//        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setUrl("jdbc:mysql://localhost:3306/mall_tiny?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai");
//        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
//        dsc.setUsername("root");
//        dsc.setPassword("");
//
//        mpg.setDataSource(dsc);
//
//        // 全局配置
//        GlobalConfig gc = new GlobalConfig();
//        gc.setOutputDir(System.getProperty("user.dir") + "/mall-tiny-mybatis-plus/src/main/java");
//        gc.setAuthor("yuri");
//        gc.setOpen(false);
//        gc.setFileOverride(true);
//        gc.setEnableCache(false);
//        mpg.setGlobalConfig(gc);
//
//        // 包配置
//        PackageConfig pc = new PackageConfig();
//        pc.setParent("com.macro.mall.tiny");
//        pc.setModuleName("pojo");
//        mpg.setPackageInfo(pc);
//
//        // 策略配置
//        StrategyConfig strategy = new StrategyConfig();
//        strategy.setNaming(NamingStrategy.underline_to_camel);
//        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        strategy.setEntityLombokModel(true);
//        strategy.setRestControllerStyle(true);
//        strategy.setInclude("user"); // 要生成的表名
//        mpg.setStrategy(strategy);
//
//        return mpg;
//    }
//}
