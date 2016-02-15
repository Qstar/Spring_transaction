package spring.demo2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Spring的声明式事务管理方式一的测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringDemo2 {
    // 测试业务层类:
    /**
     * 注入代理类:因为代理类进行了增强的操作
     */
//    @Resource(name = "accountService")
    @Resource(name = "accountServiceProxy")
    private AccountService accountService;

    @Test
    public void demo2() {
        accountService.transfer("aaa", "bbb", 200d);
    }

}
