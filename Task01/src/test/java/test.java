import com.jnshu.model.Student;
import com.jnshu.util.Add;
import com.jnshu.util.MemcachedUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tom on 2017/5/6.
 */
public class test {
//    @Before
//    public void Before() {
//       new ClassPathXmlApplicationContext(new String[] {"spring-memcached.xml"});
//        new ClassPathXmlApplicationContext("spring-memcached.xml");
//
//    }//进行加载

    @Test
    public void test7(){
        Add add=new Add();

        Assert.assertEquals(5,add.add(2,2));



    }

}
