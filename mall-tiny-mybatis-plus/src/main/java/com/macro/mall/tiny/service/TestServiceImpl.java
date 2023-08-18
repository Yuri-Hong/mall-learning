package com.macro.mall.tiny.service;

import com.macro.mall.tiny.pojo.Test;
import com.macro.mall.tiny.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TestServiceImpl {
    @Autowired
    private TestMapper testMapper;
    //查询全部
    public List<Test> queryAll() {
        return testMapper.selectList(null);
    }
}

