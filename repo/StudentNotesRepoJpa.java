package com.empdb.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.empdb.model.StudentNotes;

public interface StudentNotesRepoJpa extends JpaRepository<StudentNotes, Integer> {

	

	

}
