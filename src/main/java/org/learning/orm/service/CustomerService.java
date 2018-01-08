package org.learning.orm.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.learning.orm.dao.CustomerMapper;
import org.learning.orm.pojo.Customer;
import org.learning.orm.utils.MyBatisUtil;

public class CustomerService {

	public List<Customer> getAllCustomers() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try{
			CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
			return customerMapper.getAllCustomers();
		}finally{
			sqlSession.close();
		}
	}
}
