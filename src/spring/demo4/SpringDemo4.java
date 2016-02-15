package spring.demo4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Spring的声明式事务管理方式二:基于AspectJ的XML方式的配置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringDemo4 {
    // 测试业务层类:
    /**
     * 注入代理类:因为代理类进行了增强的操作
     */
    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void demo4() {
        accountService.transfer("aaa", "bbb", 200d);
    }

}
