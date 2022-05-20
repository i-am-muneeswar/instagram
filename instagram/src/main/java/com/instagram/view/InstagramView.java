package com.instagram.view;

import java.util.Scanner;

import com.instagram.controller.InstagramController;
import com.instagram.controller.InstagramControllerInterface;

public class InstagramView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="y";
		
		while(s.equals("y")) {
		
		System.out.println("*********** Main Menu ***********");
		System.out.println("Press 1 to create profile");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice:");
		int ch = sc.nextInt();
		
		InstagramControllerInterface ic = new InstagramController();
		
		switch (ch) {
			case 1:
				ic.createProfile();
				break;
				
			default:
				System.out.println("Wrong Choice");
			}
		
		System.out.println("Press y/n to contine");
		s = sc.next();
		
		}

	}

}
