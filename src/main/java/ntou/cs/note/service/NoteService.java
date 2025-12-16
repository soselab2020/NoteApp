package ntou.cs.service;

import ntou.cs.entity.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class NoteService {
    private final List<Note> notes = new ArrayList<>();

    public Note create(String content, String category, java.time.LocalDate dueDate) {
        if (content == null || content.isBlank()) {
            throw new IllegalArgumentException("content 不可為空");
        }
        var note = new Note(content.trim(), category, dueDate);
        notes.add(note);
        return note;
    }

    public List<Note> list() {
        return Collections.unmodifiableList(notes);
    }
}
