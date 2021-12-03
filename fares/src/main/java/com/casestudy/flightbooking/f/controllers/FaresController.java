package com.casestudy.flightbooking.f.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.flightbooking.f.model.FareDetails;
import com.casestudy.flightbooking.f.repo.FareRepo;
import com.google.common.base.Optional;

/*import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fares")
public class fares_controller {
@RequestMapping("/hey")
public String hey() {
	return "welcome to fares";
}
}*/

@RestController
@RequestMapping("/fare")
public class FaresController {
@Autowired
FareRepo rp;

@GetMapping("/getfare/{id}/{economy}")
public Optional<FareDetails> getfare(@PathVariable String id,@PathVariable String economy) {
		return rp.get(id,economy);
}
@PostMapping("/getfare/add")
public String add(@RequestBody FareDetails f1) {
	try {
		rp.insert(f1);
		return "sucess";
	}catch(Exception e) {
		return "sorry problem in creation ";
	}
	
}
}

