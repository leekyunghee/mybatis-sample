package pri.lkh.boot.mybatis.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pri.lkh.boot.mybatis.mybatis.model.Account;
import pri.lkh.boot.mybatis.mybatis.service.AccountService;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class AccountServiceTests {

    @Autowired
    AccountService accountService;

    @Test
    public void getAccountById() {
        accountService.getAccountById(1L);
    }

    @Test
    public void getAllAccount() {
        List<Account> accountList =  accountService.getAllAccount();
        assertThat(accountList).isEqualTo(new Account("leekyunghee", 35));
    }

    @Test
    public void addAccount() {
        accountService.addAccount(new Account("kim ji u", 30));
        accountService.addAccount(new Account("kim su ro", 40));
    }

}
