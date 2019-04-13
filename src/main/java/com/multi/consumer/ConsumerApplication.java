package com.multi.consumer;

import com.multi.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumerApplication implements CommandLineRunner {

    @Value("${resource.baseurl}")
    private String baseurl;

    @Autowired
    private ConsumerService consumerService;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        consumerService.getUserInfoList(baseurl+"posts");
        consumerService.getUserInfo(baseurl+"/posts/1");
    }
}
