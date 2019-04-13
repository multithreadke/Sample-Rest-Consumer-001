package com.multi.consumer.service;

import com.multi.consumer.model.User;

import java.util.List;

/**
 * User: git
 * Date: 08/09/2018
 * Time: 08:23
 */
public interface ConsumerService {
    List<User> getUserInfoList(String baseurl);
    User getUserInfo(String baseurl);
}
