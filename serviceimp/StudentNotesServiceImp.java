package com.empdb.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empdb.exception.ResourceNotFoundException;
import com.empdb.model.StudentNotes;
import com.empdb.repo.StudentNotesRepoJpa;
import com.empdb.service.StudentNotesService;
@Service
public class StudentNotesServiceImp implements StudentNotesService{

	@Autowired
	StudentNotesRepoJpa repo;
	
	@Override
	public StudentNotes saveNotes(StudentNotes notes) {
		// TODO Auto-generated method stub
		return repo.save(notes);
	}

	@Override
	public List<StudentNotes> getAllNotes() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public StudentNotes getNotesById(int id) {
		// TODO Auto-generated method stub
		Optional<StudentNotes>notes=repo.findById(id);
		if(notes.isPresent()) {
			return notes.get();
		}
		
		 throw new ResourceNotFoundException("StudentNotes", "ID", id);
	}



	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		StudentNotes notes=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("StudentNotes", "ID", id));
		repo.delete(notes);
		return  "Notes Deleted";
	}

	

}
