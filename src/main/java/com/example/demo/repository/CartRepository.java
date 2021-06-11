package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Long>{

}
