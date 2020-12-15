package com.mace.config.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author: zhangxuhui
 * @Date: 2020/12/15 9:19 下午
 * @email: zxh_1633@163.com
 */
@Component
@ConfigurationProperties(prefix = "city")
@PropertySource(value={"classpath:city.properties"})
public class City {
    private String name;
    private Integer age;
    private String address;
    private String path;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
