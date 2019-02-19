package club.codeopen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author by cheng
 * @description: 消费者(feign)
 * @data 2019/2/19
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceConsumerFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumerFeignApplication.class,args);
    }
}
