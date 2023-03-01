package com.empdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.empdb.model.StudentNotes;
import com.empdb.service.StudentNotesService;


@CrossOrigin
@RestController
public class StudentNotesControoler {
	@Autowired
	StudentNotesService service;
	
	
	
	@PostMapping("Notes")
	public ResponseEntity<StudentNotes> saveVechile(@RequestBody StudentNotes notes){
		
		return new ResponseEntity<StudentNotes>(service.saveNotes(notes),HttpStatus.CREATED);
	}
	
	@GetMapping("Notes")
	public List<StudentNotes> getAllNotes(){
		return service.getAllNotes();
	}
	
	@GetMapping("Notes/{id}")
	public ResponseEntity<StudentNotes> getNotesById(@PathVariable("id") int id){
		
		return new ResponseEntity<StudentNotes>(service.getNotesById(id),HttpStatus.OK);
	}
	

	
	
	@DeleteMapping("Notes/{id}")
	public String deleteById(@PathVariable("id")int id) {
		return service.deleteById(id);
	}
		
	
	

}
