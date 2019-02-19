package club.codeopen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by cheng
 * @description: 服务提供控制器
 * @data 2019/2/19
 */
@RestController
public class ProviderController {
    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @Value("${server.port}")
    private int port;

    @GetMapping("/hello/{message}")
    public String hello(@PathVariable("message")String message){
        return String.format("Hello " + message + ",I am provider .I am from "+ port);
    }


    @GetMapping("getname")
    public String getName(){
        return "Hello " + applicationContext.getEnvironment().getProperty("user.name");
    }

}
