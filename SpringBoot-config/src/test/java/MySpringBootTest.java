import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.mace.config.App;
import com.mace.config.bean.City;
import com.mace.config.bean.Person;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit4.SpringRunner;
import java.io.IOException;
/**
 * @Author: zhangxuhui
 * @Date: 2020/12/14 9:33 下午
 * @email: zxh_1633@163.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class MySpringBootTest {

    @Autowired
    ApplicationContext ioc;

    @Autowired
    Person person;

    @Autowired
    City city;

    //使用普通字符串
    @Value("jack")
    private String name;

    //注入操作系统属性值
    @Value("#{systemProperties['os.name']}")
    private String sysInfo;

    //注入表达式属性
    @Value("#{T(java.lang.Math).random() * 100}")
    private int randomNum;

    //注入其他组件的属性
    @Value("#{person.name}")
    private String pojoName;
    //注入文件中的数据
    @Value("classpath:message.json")
    private Resource text;

    //注入url资源
    @Value("http://www.baidu.com")
    private Resource baidu;

    //自动注入环境变量对象，从而获取配置的各个属性
    @Autowired
    private Environment env;

    //文件的名字注意，不能使用驼峰命名法，否则无法识别
    @Value("classpath:bjx.txt")
    private Resource baijiaxing;

    @Test
    public void test(){
        System.out.println(person);
    }

    @Test
    public void test2(){
        System.out.println(city);
    }

    @Test
    public void test3(){
        System.out.println(ioc.containsBean("userService"));
    }

    @Test
    public void test4() throws IOException {
        System.out.println(name);
        System.out.println(sysInfo);
        System.out.println(randomNum);
        System.out.println(pojoName);
        String json = IOUtils.toString(text.getInputStream(),"utf-8");
        System.out.println(json);
        JSONObject jsonObject = JSON.parseObject(json);
        System.out.println(jsonObject.get("name"));
        System.out.println(baidu.getURL());
        System.out.println(env.getProperty("server.port"));

        String s = IOUtils.toString(baijiaxing.getInputStream(), "utf-8");
        System.out.println(s);
    }

}
