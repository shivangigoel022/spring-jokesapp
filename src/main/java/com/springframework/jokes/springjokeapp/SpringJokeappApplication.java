package com.springframework.jokes.springjokeapp;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class SpringJokeappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJokeappApplication.class, args);
    }

}
