package pri.lkh.boot.mybatis.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "pri.lkh.boot.mybatis")
public class MybatisSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisSampleApplication.class, args);
	}

}
