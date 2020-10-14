package com.yuewen.unite.demo.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.qq.cloud.taf.spring.annotation.EnableTafServer;
import com.qq.cloud.taf.spring.annotation.RemotePropertySource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableTafServer
@RemotePropertySource({"config.properties"})
@ComponentScan("com.yuewen.unite.demo.spring.boot")
// @MapperScan({"com.yuewen.unite.demo.spring.boot.dao.mapper"})
public class TafDemoServiceSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(TafDemoServiceSpringBootApplication.class, args);
    }
}