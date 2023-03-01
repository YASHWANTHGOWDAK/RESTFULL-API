package com.empdb.service;

import java.util.List;

import com.empdb.model.StudentNotes;

public interface StudentNotesService {
	
	StudentNotes saveNotes(StudentNotes notes);
	
	List<StudentNotes> getAllNotes();
	
	StudentNotes getNotesById(int id);
	

	
	String deleteById(int id);

}
