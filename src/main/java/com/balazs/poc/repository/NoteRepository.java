package com.balazs.poc.repository;

import com.balazs.poc.model.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends CrudRepository<Note, String> {
}
