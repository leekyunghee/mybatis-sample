package pri.lkh.boot.mybatis.mybatis.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("account")
public class Account {
    private Long id;
    private String name;
    private Long age;

    public Account(String name, long age) {
    }

    public Account(Long id, String name, Long age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
