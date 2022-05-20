package com.instagram.service;

import com.instagram.dao.InstagramDAO;
import com.instagram.entity.InstagramUser;

public class InstagramService {

	public int createProfileService(InstagramUser iu) {
		// TODO Auto-generated method stub
		
		InstagramDAO id = new InstagramDAO();
		int i = id.createProfileDAO(iu);
		return i;
		
	}
	
	

}
