package org.gourd.hu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author gourd
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@Slf4j
public class SubWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(SubWebApplication.class, args);
        log.warn(">o< sub服务启动成功！温馨提示：代码千万行，注释第一行，命名不规范，同事泪两行 >o<");
    }
}
