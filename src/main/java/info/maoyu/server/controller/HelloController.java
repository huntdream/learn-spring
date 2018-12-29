package info.maoyu.server.controller;

import info.maoyu.server.Hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Hello hello(@RequestParam(value = "name", defaultValue = "Yu Mao") String name, @RequestParam(value = "age", defaultValue = "22") int age) {
        System.out.println(name+"=="+age);
        return new Hello(name, age);
    }
}
