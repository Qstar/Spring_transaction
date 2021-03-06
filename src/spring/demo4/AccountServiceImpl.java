package spring.demo4;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 转账案例的业务层实现类
 */

//        propagation:事务传播行为
//        isolation:事务隔离级别
//        read-only:只读
//        rollback-for:发生哪些异常回滚
//        no-rollback-for:发生哪些异常不回滚
//        timeout:过期信息

@Transactional(propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {
    //  注入转账DAO的类
    private AccountDao accountDao;
    //注入事务管理的模版
    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    //声明式事务一

    /**
     * @param out   :转出账号
     * @param in    :转入账号
     * @param money :转账金额
     */
    @Override
    public void transfer(String out, String in, final Double money) {
        accountDao.outMoney(out, money);
        int i = 1 / 0;
        accountDao.inMoney(in, money);
    }
}
