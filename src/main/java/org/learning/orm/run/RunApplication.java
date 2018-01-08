package org.learning.orm.run;

import java.util.List;

import org.learning.orm.pojo.Customer;
import org.learning.orm.service.CustomerService;

public class RunApplication {

	public static void main(String[] args) {
		CustomerService service = new CustomerService();
		List<Customer> allCustomers = service.getAllCustomers();
		System.out.println(allCustomers);
	}

}
