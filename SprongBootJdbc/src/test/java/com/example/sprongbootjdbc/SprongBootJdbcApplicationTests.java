package com.example.sprongbootjdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootTest
class SprongBootJdbcApplicationTests {


    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    void contextLoads() {
        DataSource dataSource = jdbcTemplate.getDataSource();
        System.out.println(dataSource.getClass());

        Long aLong = jdbcTemplate.queryForObject("select count(*) from pms_brand", Long.class);
        System.out.println(aLong);
    }

}
