package com.example.springboottest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootTest
class SpringBootTestApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
    private ApplicationContext context;
    @Value("${oyd.myname}")
    String name;
    @Value("${oyd.myage}")
    String age;
    @Value("${oyd.myphone}")
    String phone;

    @Test
    void testPropertiesAndYaml() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(phone);
        String[] activeProfiles = context.getEnvironment().getActiveProfiles();
        System.out.println(Arrays.toString(activeProfiles));
    }

}
