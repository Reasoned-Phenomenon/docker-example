package com.example.bootdocker;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class BootDockerController {

    @GetMapping("hello")
    public String getMethodName() {
        return "안녕하세요";
    }
}
