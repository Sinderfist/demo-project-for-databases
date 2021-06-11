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

import com.example.demo.model.Checkout;
import com.example.demo.service.CheckoutService;


@RestController
@RequestMapping("/checkout")

public class CheckoutController {

	@Autowired
	CheckoutService checkoutservice;
	
	@GetMapping
	public Iterable<Checkout> getItems(){
		return checkoutservice.getItems();
	}
	
	@GetMapping("/{id}")
	public Checkout getItemById(Long id) {
		return checkoutservice.getItemById(id);
	}
	
	@PostMapping
	public Checkout createItem(@RequestBody Checkout item) {
		return checkoutservice.createItem(item);
	}
	
	@PatchMapping
	public Checkout updateItem(@RequestBody Checkout item) {
		return checkoutservice.updateItems(item);
	}
	
	@DeleteMapping("/{id}")
	public HttpStatus deleteItem(@PathVariable Long id) {
		return checkoutservice.deleteItems(id);
	}
}
