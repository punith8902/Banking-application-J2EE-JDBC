package com.Bank.dto;

public class Customer {
	
		private long Acc_no;
		private String name;
		private long phone;
		private String mail;
		private double bal;
		private int pin;
		//default constructor
		public Customer() {
			
		}
		//parameterized constructors
		public Customer(long acc_no, String name, long phone, String mail, double bal, int pin) {
			super();
			Acc_no = acc_no;
			this.name = name;
			this.phone = phone;
			this.mail = mail;
			this.bal = bal;
			this.pin = pin;
		}

		//getters and setters
		public long getAcc_no() {
			return Acc_no;
		}

		public void setAcc_no(long acc_no) {
			Acc_no = acc_no;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public long getPhone() {
			return phone;
		}


		public void setPhone(long phone) {
			this.phone = phone;
		}


		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}


		public double getBal() {
			return bal;
		}


		public void setBal(double bal) {
			this.bal = bal;
		}


		public int getPin() {
			return pin;
		}


		public void setPin(int pin) {
			this.pin = pin;
		}



		}
