package com.dhtbank.Model;

import java.io.Serializable;
import java.util.Collection;

import lombok.Data;



@Data
public class Bill implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private Customer customer;
	private Employee  employee;
	private Collection<DetailBill> detailBills;

}
