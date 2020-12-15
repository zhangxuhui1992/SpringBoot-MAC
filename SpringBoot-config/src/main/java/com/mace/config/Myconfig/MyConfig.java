package com.mace.config.Myconfig;

import com.mace.config.service.UserService;
import org.apache.catalina.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @Author: zhangxuhui
 * @Date: 2020/12/15 9:31 下午
 * @email: zxh_1633@163.com
 */
@SpringBootConfiguration
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
