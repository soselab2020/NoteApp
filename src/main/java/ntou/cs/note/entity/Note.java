package ntou.cs.entity;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

public class Note {
    private final String id;
    private final String content;
    private final String category;
    private final LocalDate dueDate;
    private final OffsetDateTime createdAt;

    public Note(String content, String category, LocalDate dueDate) {
        this.id = UUID.randomUUID().toString();
        this.content = content;
        this.category = category;
        this.dueDate = dueDate;
        this.createdAt = OffsetDateTime.now();
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }
}
