package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DAO.CustomerDAO;
import com.Entity.Customer;
import com.Service.CustomerService;


@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	/*@Autowired
	private CustomerDAO customerDAO; */
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/list")
	public String listCustomer(Model theModel)
	{
		//get the customers from DAO
		//List<Customer> theCustomer = customerDAO.getCustomers();
		List<Customer> theCustomer = customerService.getCustomers();
		//add the customers to the model
		theModel.addAttribute("customers", theCustomer);
		
		return "customer-list";
	}

}
