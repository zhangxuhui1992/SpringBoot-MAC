package com.mace.config.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

/**
 * @Author: zhangxuhui
 * @Date: 2020/12/14 9:26 下午
 * @email: zxh_1633@163.com
 * ConfigurationProperties 将配置文件中的属性映射进组件
 * 通过前缀进行绑定，将配置文件中的属性和java bean中的属性进行一一绑定
 * 只有容器中的组件，才能使用此功能。
 * @Value("${name}") 从配置文件中映射取值 #{spel} #{11*2} spring表达式语言
 * ConfigurationProperties 支持松散语法绑定 支持数据校验
 * @Value 不支持复杂类型的封装，只支持基本数据类型。
 * @PropertySource(value={"calsspath:user.properties"})加载指定的配置文件
 * @ImportResource 导入Spring的配置文件
 */
@Component
//@ConfigurationProperties(prefix = "person")
//@Validated
public class Person {
    //@NotNull
    @Value("荒野镖客")
    private String name;
    //@Email
    private int age;
    private Map<String,Object> map;
    private List<String> list;
    private Dog dog;

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

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", map=" + map +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }
}
