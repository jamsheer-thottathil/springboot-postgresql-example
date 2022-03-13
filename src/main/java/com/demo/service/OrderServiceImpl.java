package com.demo.service;

import com.demo.entity.Orders;
import com.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public List<Orders> placeOrders() {
        return orderRepository.findAll();
    }
}
