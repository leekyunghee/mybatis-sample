package pri.lkh.boot.mybatis.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pri.lkh.boot.mybatis.mybatis.mapper.AccountMapper;
import pri.lkh.boot.mybatis.mybatis.model.Account;

import java.util.List;

@Service
@Transactional
public class AccountService {
    @Autowired
    AccountMapper accountMapper;

    public Account getAccountById(Long id) {
        return accountMapper.selectAccountById(id);
    }

    public List<Account> getAllAccount() {
        return accountMapper.selectAllAccount();
    }

    public void addAccount(Account account) {
        accountMapper.insertAccount(account);
    }
}

