package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Cart;
import com.example.demo.service.CartService;

@RestController
@RequestMapping("/cart")

public class CartController {
	
	@Autowired
	CartService cartservice;
	
	@GetMapping
	public Iterable<Cart> getItems(){
		return cartservice.getItems();
	}
	
	@GetMapping("/{id}")
	public Cart getItemById(Long id) {
		return cartservice.getItemById(id);
	}
	
	
	@PostMapping
	public Cart createItem(@RequestBody Cart item) {
		return cartservice.createItem(item);
	}
	
	@PatchMapping
	public Cart updateItem(@RequestBody Cart item) {
		return cartservice.updateItems(item);
	}
	
	@DeleteMapping("/{id}")
	public HttpStatus deleteItem(@PathVariable Long id) {
		return cartservice.deleteItems(id);
	}
}
