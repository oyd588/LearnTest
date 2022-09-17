package com.example.springbootdruid;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

@SpringBootTest
class SpringBootDruidApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    void contextLoads() throws SQLException {
        DataSource dataSource = jdbcTemplate.getDataSource();
        System.out.println(dataSource.getClass());


        Long aLong = jdbcTemplate.queryForObject("select count(*) from pms_brand", Long.class);
        System.out.println(aLong);
    }

}
