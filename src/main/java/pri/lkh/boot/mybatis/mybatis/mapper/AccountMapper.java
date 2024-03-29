package pri.lkh.boot.mybatis.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import pri.lkh.boot.mybatis.mybatis.model.Account;

import java.util.List;

@Mapper
public interface AccountMapper {

    Account selectAccountById(Long id);
    List<Account> selectAllAccount();
    void insertAccount(Account account);
}
