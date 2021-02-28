package com.dhtbank.Model;

import java.io.Serializable;

import lombok.Data;


@Data
public class DetailBill implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private Bill bill;

	private Product product;

}
