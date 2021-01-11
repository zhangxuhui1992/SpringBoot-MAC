package com.mace.config.Myconfig;

import com.mace.config.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zhangxuhui
 * @Date: 2020/12/15 9:31 下午
 * @email: zxh_1633@163.com
 * 功能与@SpringBootConfiguration一样
 * proxyBeanMethods = true 代理bean的方法，代理对象调用方法，
 * springboot会检查容器中是否有这个组件，有则直接使用，没有则创建
 * 以此来保证组件的单实例。如果设置为false则每次都创建新的组件。
 * LITE (proxyBeanMethods = false) 组件之间无依赖关系，加速容器启动过程，加少判断。
 * FULL(proxyBeanMethods = true) 组件之间有依赖关系，方法会被调用得到之前单实例组件。
 */
//@SpringBootConfiguration
@Configuration(proxyBeanMethods = true)
public class MyConfig {
    /**
     * @Bean 向容器中添加组件，默认ID为方法名
     * @return
     */
    @Bean
    public UserService userService(){
        return new UserService();
    }


}
