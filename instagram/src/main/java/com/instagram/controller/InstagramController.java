package com.instagram.controller;

import java.util.Scanner;
import org.apache.log4j.Logger;

import com.instagram.entity.InstagramUser;
import com.instagram.service.InstagramService;

public class InstagramController implements InstagramControllerInterface{
	
	final static Logger log = Logger.getLogger(InstagramController.class);

	public void createProfile() {
		
		log.info("Saving inside the Instagram Controller");
		
		Scanner sc = new Scanner(System.in);
		log.info("Enter name");
		String name = sc.next();
		
		log.info("Enter password");
		String password = sc.next();
		
		log.info("Enter email");
		String email = sc.next();
		
		log.info("Enter address");
		String address = sc.next();
		
		InstagramUser iu = new InstagramUser();
		
		iu.setName(name);
		iu.setPassword(password);
		iu.setEmail(email);
		iu.setAddress(address);
		
		
		InstagramService is = new InstagramService();
		int i = is.createProfileService(iu);
		
		if(i>0) {
			System.out.println("Your Profile is created Mr./Mrs. "+name);
		}
		else {
			System.out.println("Could not create profile");
		}
		
		
		
	}
	
	

}
// class collection of function and variables
// object is instance of an class. instance means create and initialize memory. create using new and initialize using constructor.