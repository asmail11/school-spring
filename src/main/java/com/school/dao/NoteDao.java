package com.school.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.modal.Note;

@Repository
public interface NoteDao extends JpaRepository<Note, Long>{

}
