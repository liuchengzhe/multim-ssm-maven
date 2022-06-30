package com.demo.service;

import com.demo.orm.po.HelloWorld;

public interface HelloWorldService {
    public String getHellWorld(String name);

    public HelloWorld getById(int id);
}
