package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: zhangxuhui
 * @Date: 2020/12/3 9:29 下午
 * @email: zxh_1633@163.com
 * @SpringBootApplication 标注是一个Springboot程序
 * @SpringBootConfiguration 标注是一个配置类 同 confitguration
 * @EnableAutoConfiguration 开启Springboot的自动配置
 * @AutoConfigurationPackage 自动配置包 将主配置类及其子包下的所以组件扫描进Spring容器
 * @Import({AutoConfigurationImportSelector.class}) 所有的自动配置类，根据starter，选择部分生效
 * 免去了自己手动配置的繁琐，但是也可以修改原始配置，添加自定义内容。
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
