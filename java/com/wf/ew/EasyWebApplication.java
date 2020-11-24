package com.wf.ew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.wf.jwtp.configuration.EnableJwtPermission;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableJwtPermission
@SpringBootApplication
public class EasyWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyWebApplication.class, args);
    }
}
