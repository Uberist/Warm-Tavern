package org.example.warmtavernweb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.DriverManager;

@SpringBootApplication
public class WarmTavernWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WarmTavernWebApplication.class, args);
    }

}
