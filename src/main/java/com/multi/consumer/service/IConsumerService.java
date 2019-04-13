package com.multi.consumer.service;

import com.multi.consumer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * User: git
 * Date: 08/09/2018
 * Time: 08:24
 */
@Service
public class IConsumerService implements ConsumerService{

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<User> getUserInfoList(String baseUrl) {
        return Arrays.stream(restTemplate.getForObject(baseUrl, User[].class)).collect(Collectors.toList());
    }

    @Override
    public User getUserInfo(String baseurl) {
        return restTemplate.getForObject(baseurl, User.class);
    }
}
