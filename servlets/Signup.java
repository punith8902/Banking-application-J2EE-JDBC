package com.Bank.servlets;

import java.io.IOException;

import java.io.PrintWriter;

import com.Bank.dao.Customerdao;
import com.Bank.dao.CustomerdaoImpl;
import com.Bank.dto.Customer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class Signup extends HttpServlet
{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   //collecting the data from the user
	String name=req.getParameter("name");
	String mobile=req.getParameter("phone");
	String  mail=req.getParameter("mail");
	String  String_pin=req.getParameter("pin");
	String  confirm_pin=req.getParameter("confirm");
	
	//conversion or parsing the data
	long phone=Long.parseLong(mobile);
	int pin=Integer.parseInt(String_pin);
	int confirm=Integer.parseInt(confirm_pin);
	
	//jdbc logic
	Customer c=new Customer();
	Customerdao cdao=new CustomerdaoImpl();
	//PrintWriter out=resp.getWriter();
	c.setName(name);
	c.setPhone(phone);
	c.setMail(mail);
	if(pin==confirm) {
		c.setPin(pin);
		boolean res=cdao.insertCustomer(c);
		if(res) {
		c=cdao.getCustomer(phone,mail);
		req.setAttribute("Customer", c);
		req.setAttribute("success", "Account created successfully,your account number is "+c.getAcc_no());
		RequestDispatcher rd=req.getRequestDispatcher("signup.jsp");
		rd.forward(req, resp);
		
		 //c=cdao.getCustomer(phone,mail);
		 //out.println("<h1>Hi"+name+",your account has been created.Your account number is"+c.getAcc_no());
		}
		else {
			req.setAttribute("Customer", c);
			req.setAttribute("failure","Failed to create a account!!");
			RequestDispatcher rd=req.getRequestDispatcher("signup.jsp");
			rd.forward(req, resp);
			
			//out.println("<h1>Failed to create the account.Try again! </h1>");
		}
	}
}
}
