package pri.lkh.boot.mybatis.mybatis.config;

import pri.lkh.boot.mybatis.mybatis.MybatisSampleApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackageClasses = MybatisSampleApplication.class)
public class DataSourceConfig {

}