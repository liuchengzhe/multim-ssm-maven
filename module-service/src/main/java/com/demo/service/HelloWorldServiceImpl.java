package com.demo.service;

import com.demo.orm.mapper.HelloWorldMapper;
import com.demo.orm.po.HelloWorld;
import com.demo.orm.po.HelloWorldExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    @Autowired
    private HelloWorldMapper helloWorldMapper;

    @Override
    public String getHellWorld(String name) {
        return "Hello " + name;
    }

    @Override
    public HelloWorld getById(int id) {
        HelloWorldExample example = new HelloWorldExample();
        HelloWorldExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        return helloWorldMapper.selectByExample(example).stream().findFirst().orElse(null);
    }

}
