package com.dhtbank.Model;

import java.io.Serializable;

import lombok.Data;


@Data
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Float price;
	private int amount;

}
