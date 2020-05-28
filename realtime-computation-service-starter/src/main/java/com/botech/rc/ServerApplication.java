package com.botech.rc;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author yurg
 * @version 1.0
 * @date 2020/1/3 10:06
 */
@EnableSwagger2
@EnableFeignClients(basePackages = {"com.botech.**.reference"})
@EnableTransactionManagement
@MapperScan("com.botech.**.dao")
@ComponentScan(value = {"com.botech"})
@SpringCloudApplication
@EnableApolloConfig
@EnableScheduling
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}

