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
@ WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String String_acc_no=req.getParameter("acc_no");
	   String  String_pin=req.getParameter("pin");
		
		
		long acc_no=Long.parseLong(String_acc_no);
		int pin=Integer.parseInt(String_pin);
		
		
		//Customer c=new Customer();
		Customerdao cdao=new CustomerdaoImpl();
		PrintWriter out=resp.getWriter();
		
			Customer c=cdao.getCustomer(acc_no,pin);
			if(c!=null) {
				req.setAttribute("Customer", c);
				req.setAttribute("success", "Login successfully,your name is: "+c.getName());
				RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
				rd.forward(req, resp);
			// c=cdao.getCustomer(pin);
			// out.println("<h1>Hi"+name+",your account has been login in successfully.Your account number is"+c.getAcc_no());
			}
			else {
				req.setAttribute("Customer", c);
				req.setAttribute("failure","Failed to create a account!!");
				RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
				rd.forward(req, resp);
				
	}
}
	}
