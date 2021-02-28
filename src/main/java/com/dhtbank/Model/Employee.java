package com.dhtbank.Model;

import java.io.Serializable;

import lombok.Data;
@Data
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String userName;
	private String passWord;
	private String adress;

}
