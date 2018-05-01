package com.rt;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PasswordEncoder pe = new BCryptPasswordEncoder();
		System.out.println(pe.encode("1234"));
		System.out.println("after encoding");
	}

}
