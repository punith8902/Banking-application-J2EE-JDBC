package com.Bank.dao;

import java.util.List;

import com.Bank.dto.Customer;

public interface Customerdao {
	public boolean insertCustomer(Customer c);
	public Customer getCustomer(long Acc_no,int pin);
	public Customer getCustomer(long phoneno,String mail);
	public Customer getCustomer(long Acc_no);
	public List getCustomer();
	public boolean updateCustomer(Customer c);
	public boolean deleteCustomer(Customer c);
	}
