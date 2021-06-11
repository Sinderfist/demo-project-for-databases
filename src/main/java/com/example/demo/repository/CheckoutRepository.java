package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Checkout;



public interface CheckoutRepository extends CrudRepository <Checkout, Long> {

}
