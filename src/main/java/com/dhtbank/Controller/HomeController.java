package com.dhtbank.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.dhtbank.Model.Employee;

@Controller
@RequestMapping(path="/")
public class HomeController {
	private RestTemplate rest = new RestTemplate();
	@GetMapping()
	public String home() {
		return "employee/login";
	}
	@PostMapping("/login")
	public String getLogin (HttpSession session,@RequestParam("userName") String userName,@RequestParam("passWord") String passWord)
	{
		Employee e=new Employee();
		e.setUserName(userName);
		e.setPassWord(passWord);
		Employee employee = rest.postForObject("http://localhost:8080/employee/login",e,Employee.class);
		
		if(employee!=null)
			{
			session.setAttribute("employee", employee.getId());
			return("redirect:/employee/customer");
			}
		return ("redirect:/");
	}

}
