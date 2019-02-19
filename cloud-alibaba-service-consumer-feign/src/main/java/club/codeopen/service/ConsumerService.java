package club.codeopen.service;

import club.codeopen.service.fallback.ConsumerServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author by cheng
 * @description: feign service
 * @data 2019/2/19
 */
@FeignClient(value = "service-provider", fallback = ConsumerServiceFallback.class)
public interface ConsumerService {
    @GetMapping("/hello/{message}")
    String hello(@PathVariable("message")String message);
}
