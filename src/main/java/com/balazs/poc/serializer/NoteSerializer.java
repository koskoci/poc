package com.balazs.poc.serializer;

import com.balazs.poc.model.Note;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

@JsonComponent
public class NoteSerializer extends JsonSerializer<Note> {

    @Override
    public void serialize(Note note, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
        throws IOException {

        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField( note.getId(), note.getValue() );
        jsonGenerator.writeEndObject();
    }
}
