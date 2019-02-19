package club.codeopen.controller;

import club.codeopen.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by cheng
 * @description: 消费者控制器(feign)
 * @data 2019/2/19
 */
@RestController
public class ConsumerFeignController {
    private final ConsumerService consumerService;

    @Autowired
    public ConsumerFeignController(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }
    @GetMapping(value = "/hello/{message}")
    public String hello(@PathVariable("message")String message) {
        return consumerService.hello(message);
    }

}
