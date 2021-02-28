package com.dhtbank.Model;

import java.io.Serializable;
import java.util.Collection;

import lombok.Data;


@Data
public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String adress;

	private Collection<Bill> bills;

}
