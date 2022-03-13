package com.demo.controller;

import com.demo.entity.Orders;
import com.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/all")
    public ResponseEntity<?> getOrders() {

        List<Orders> orders = Optional.ofNullable(orderService.placeOrders()).orElseGet(Collections::emptyList);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

}
