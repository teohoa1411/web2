package com.dhtbank.Controller;

import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.dhtbank.Model.Customer;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	private RestTemplate rest=new RestTemplate();
	@GetMapping(path="/customer")
	public String homeCustomer() {
		return "employee/find-customer";
	}
	@GetMapping("/find-customer")
	public String findCustomer(Model model,@RequestParam("customerId") Long id) {
		Customer customer=rest.getForObject("http://localhost:8080/customer/{id}",Customer.class, id);
		model.addAttribute("customer", customer);
		
		return "employee/find-customer";
	}
	@PostMapping("/edit-customer")
	public String editCustomer(Model model,@ModelAttribute("customer") Customer customer)
	{
		Customer c = rest.postForObject("http://localhost:8080/customer", customer, Customer.class);
	    return("redirect:/employee/customer");
	}

}
