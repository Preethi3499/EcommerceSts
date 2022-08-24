package com.edubridge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.register1;
import com.edubridge.dao.regDAO;


@Service
public class registerService {
	@Autowired
	regDAO u;
	
	public registerService() {
		
	}

	public void savePlayer(register1 p) {
		u.save(p);
		
	}

}
