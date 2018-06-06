package secondcom.kasi.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 实现maven整合多模块
 *
 * @Author: HuangTao
 * @Date: 2018-06-07 06:12
 * @Version:
 */
@RestController
public class IndexController {

    @GetMapping(value="/hello")
    public String test(){
        System.out.println("测试test");
        return "test hello";
    }
}
