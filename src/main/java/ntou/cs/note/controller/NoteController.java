package ntou.cs.controller;

import ntou.cs.entity.Note;
import ntou.cs.request.NoteCreateRequest;
import ntou.cs.service.NoteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Note create(@RequestBody NoteCreateRequest req) {
        return noteService.create(req.getContent(), req.getCategory(), req.getDueDate());
    }

    @GetMapping
    public List<Note> list() {
        return noteService.list();
    }
}
