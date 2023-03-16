package com.example.demo.controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Software;
import com.example.demo.service.SoftwareServiceImpl;

@RestController
public class SoftwareController {
    
	
public SoftwareServiceImpl softServ;
	
	public SoftwareController(SoftwareServiceImpl softServ) {
		this.softServ = softServ;
	}
	
	@PostMapping("/saveSoftware")
	
	public ResponseEntity<Software> saveSoftware(@RequestBody Software soft){
		return new ResponseEntity<Software>(softServ.saveSoftware(soft), HttpStatus.CREATED);
	}
	
	@PutMapping("/updateSoftware/{softwareId}")
	public ResponseEntity<Software> updateSoftwareDetailsById(@PathVariable("softwareId") int id,
			@RequestBody Software soft){
		return new ResponseEntity<Software>(softServ.updateSoftwareDetailsById(soft, id), HttpStatus.OK);
	}
	
	@GetMapping("/readAllSoftware")
	public List<Software> getAllSoftware(){
		return softServ.getSoftwareFromDb();
	}
	
	
	@GetMapping("/readSoftware/{id}")
	public ResponseEntity<Software>  getSoftwareById(@PathVariable("id")  int softwareId){
		return new ResponseEntity<Software>(softServ.getSoftwareById(softwareId), HttpStatus.OK);
	}
		
	@DeleteMapping("/deleteSoftware/{id}")
	public ResponseEntity<String> deleteSoftwareById(@PathVariable("id")  int softwareId){
		 softServ.deleteSoftwareById(softwareId);
	    return new ResponseEntity<String>("deleted successfully", HttpStatus.OK);
	}
		
}
