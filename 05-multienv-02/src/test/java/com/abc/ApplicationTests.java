package com.abc;

import com.abc.service.SomeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
    @Autowired
    private SomeService service;

    @Test
    void contextLoads() {
        System.out.println(service.send());
    }

}
