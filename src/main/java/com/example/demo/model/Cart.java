package com.example.demo.model;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity

@Table (name="Cart")
public class Cart {

//	create private variables for our database
	
	//name
	//price
	//quantity
	//image
	
	@Id
	@Column
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	@Column
	private String name;
	@Column
	private int price;
	@Column
	private int quantity;
	@Column
	private String image;
	
	
	
	public Cart() {}
	
	
//	getters and setters for our private variables
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}	
	
	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

}
