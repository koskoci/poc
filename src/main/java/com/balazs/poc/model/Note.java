package com.balazs.poc.model;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;

@RedisHash("Note")
public class Note {

    @Id
    private final String id;

    private final String value;

    public Note(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }
}
