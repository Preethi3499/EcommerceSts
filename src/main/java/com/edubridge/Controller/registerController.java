package com.edubridge.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.register1;
import com.edubridge.service.registerService;

;

@RestController
@CrossOrigin(origins="http://localhost:4200")

public class registerController {

	@Autowired
	registerService s;
	@PostMapping("insert")
	public void saveP(@RequestBody register1 p) {
		s.savePlayer(p);
	}


}


