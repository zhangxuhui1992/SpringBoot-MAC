package com.mace.config.bean;

import org.springframework.stereotype.Component;

/**
 * @Author: zhangxuhui
 * @Date: 2020/12/14 9:29 下午
 * @email: zxh_1633@163.com
 */
public class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
