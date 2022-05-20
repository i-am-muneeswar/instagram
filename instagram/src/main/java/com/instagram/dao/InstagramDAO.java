package com.instagram.dao;

import com.instagram.entity.InstagramUser;

public class InstagramDAO {

	public int createProfileDAO(InstagramUser iu) {
		// TODO Auto-generated method stub
		if(iu.getName().equals("Muneeswar")) {
			return 1;
		}
		return 0;
	}
	
	

}
