package com.revature.Interface;

public class Phone {

	public static void main(String[] args) {
		 ITphone timsPhone;
	        timsPhone = new Deskphone(123456);
	        timsPhone.powerOn();
	        timsPhone.callPhone(123456);
	        timsPhone.answer();
	}

}
