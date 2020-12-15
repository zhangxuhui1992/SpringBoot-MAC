import com.mace.config.App;
import com.mace.config.bean.City;
import com.mace.config.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

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

}
