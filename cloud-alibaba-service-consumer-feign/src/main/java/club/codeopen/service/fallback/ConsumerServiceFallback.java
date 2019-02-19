package club.codeopen.service.fallback;

import club.codeopen.service.ConsumerService;
import org.springframework.stereotype.Component;

/**
 * @author by cheng
 * @description: 熔断处理
 * @data 2019/2/19
 */
@Component
public class ConsumerServiceFallback implements ConsumerService {
    @Override
    public String hello(String message) {
        return "服务器繁忙，请稍后重试";
    }
}
