package com.kirill.spring;

import lombok.Getter;
import lombok.Setter;

public class TestBean {
    @Getter
    @Setter
    public String name;

    public TestBean(String name){
        this.name = name;
    }
}
