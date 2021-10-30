package com.hsuhau.spring.service;

import com.hsuhau.spring.bean.Order;

public interface OrderService {

    Order createOrder(String username, String product);

    Order queryOrder(String username);
}