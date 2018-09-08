package com.multi.consumer;

import com.multi.consumer.model.User;
import com.multi.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

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
        System.out.println("TEST RUNNING" + baseurl+"posts/1");
        List<User> userListDetail = consumerService.GetUserInfoList(baseurl+"posts");
        for(User extractUserDetails : userListDetail)
        {
            System.out.println("User Details=> ID:"+ extractUserDetails.getPostObjectId() + " USERNAME: "+extractUserDetails.getUsername()+ " EMAIL ADDRESS: "+extractUserDetails.getEmailAddress());
        }

        User userDetails = consumerService.GetUserInfo(baseurl+"/posts/1");
        System.out.println(userDetails);
    }
}
