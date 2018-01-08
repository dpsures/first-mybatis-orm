package org.learning.orm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.learning.orm.pojo.Customer;

public interface CustomerMapper {

	@Select("SELECT * FROM customer ")
	@Results({
		@Result(id=true, property="userId", column="user_id"),
		@Result(property="emailId", column="email_id"),
		@Result(property="password", column="password"),
		@Result(property="firstName", column="first_name"),
		@Result(property="lastName", column="last_name")
	})
	public List<Customer> getAllCustomers();	 
}
