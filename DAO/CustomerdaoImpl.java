package com.Bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.Bank.connection.Connector;
import com.Bank.dto.Customer;

public class CustomerdaoImpl implements Customerdao {
	static Connection con=null;
    public CustomerdaoImpl()
    {
	   this.con=Connector.requestConnection();
    }
    
    
	@Override
	public boolean insertCustomer(Customer c) {
		PreparedStatement ps=null;
		String query="insert into Customer(name,phone,mail,pin)values(?,?,?,?)";
		
		int res=0;
		try {
			ps=con.prepareStatement(query);
			ps.setString(1, c.getName());
			
			ps.setLong(2, c.getPhone());
			
			ps.setString(3, c.getMail());
		
			ps.setInt(4, c.getPin());
			res=ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(res>0) {
			return true;
		}
		
		
	else 
	{
		
		return false;
	}
	}

	@Override
	public Customer getCustomer(long Acc_no, int pin) {
		PreparedStatement ps=null;
		ResultSet rs=null;
		Customer c=null;
		String query="select * from Customer where Acc_no=? and Pin=?";
		try {
			ps=con.prepareStatement(query);
			ps.setLong(1, Acc_no);
			ps.setInt(2, pin);
			rs=ps.executeQuery();
			if(rs.next()) 
			{
				c=new Customer();
				c.setAcc_no(rs.getInt(1));
				c.setName(rs.getString(2));
				c.setPhone(rs.getLong(3));
				c.setMail(rs.getString(4));
				c.setBal(rs.getDouble(5));
				c.setPin(rs.getInt(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}
		
		return c;
	}
	@Override
	public Customer getCustomer(long phoneno, String mail) {
		PreparedStatement ps=null;
		ResultSet rs=null;
		Customer c=null;
		String query="select * from Customer where phone=? or mail=?";
		
	try {
		ps=con.prepareStatement(query);
		ps.setLong(1, phoneno);
		ps.setString(2, mail);
		rs=ps.executeQuery();
		if(rs.next()) 
		{
			c=new Customer();
			c.setAcc_no(rs.getInt(1));
			c.setName(rs.getString(2));
			c.setPhone(rs.getLong(3));
			c.setMail(rs.getString(4));
			c.setBal(rs.getDouble(5));
			c.setPin(rs.getInt(6));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		return c;
	}
	@Override
	public Customer getCustomer(long Acc_no) {
		PreparedStatement ps=null;
		ResultSet rs=null;
		Customer c=null;
		String query="select * from customer where Acc_no=?";
		try {
			ps=con.prepareStatement(query);
			ps.setLong(1,Acc_no);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				c=new Customer();
				c.setAcc_no(rs.getInt(1));
				c.setName(rs.getString(2));
				c.setPhone(rs.getLong(3));
				c.setMail(rs.getString(4));
				c.setBal(rs.getDouble(5));
				c.setPin(rs.getInt(6));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
	}
		return c;
	}
	@Override
	public List getCustomer() {
		
		return null;
	}
	@Override
	public boolean updateCustomer(Customer c) {
		PreparedStatement ps=null;
		int res=0;
		String query="update customer set name=?,phone=?,mail=?,balance=?,pin=? where Acc_no=?";
		try {
			con.setAutoCommit(false);
		
			ps=con.prepareStatement(query);
			ps.setString(1, c.getName());
			ps.setLong(2, c.getPhone());
			ps.setString(3, c.getMail());
			ps.setDouble(4, c.getBal());
			ps.setInt(5, c.getPin());
			ps.setLong(6, c.getAcc_no());
			res=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(res>0) {
			try {
			con.commit();
		}catch(SQLException e) {
			e.printStackTrace();
		}
			return true;
		}else {
	        try {
	        	con.rollback();
	        	
	        }catch(SQLException e) {
	        	e.printStackTrace();
	        }
		return false;
	}
	}
	@Override
	public boolean deleteCustomer(Customer c) {
		
		return false;
	}
}
