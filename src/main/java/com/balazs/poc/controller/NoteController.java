package com.balazs.poc.controller;

import com.balazs.poc.model.Note;
import com.balazs.poc.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Controller
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;

    @PostMapping("notes/{id}")
    public ResponseEntity<String> setNote(@RequestBody String message, @PathVariable("id") String id) {
        Note note = new Note(id, message);
        noteRepository.save(note);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/notes/{id}")
    public ResponseEntity<Optional<Note>> readNote(@PathVariable("id") String id){
        Optional<Note> note = noteRepository.findById(id);
        return new ResponseEntity<>(note, HttpStatus.CREATED);
    }
}
