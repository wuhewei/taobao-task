package cn.hewei.task;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.hewei.task.dao")
public class TaobaoTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaobaoTaskApplication.class, args);
    }

}
