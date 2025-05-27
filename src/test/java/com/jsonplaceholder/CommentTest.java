package com.jsonplaceholder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CommentTest {
    @Test
    public void testCommentHasText() {
        Comment c = new Comment(1, "Esto es un comentario");
        assertFalse(c.getText().trim().isEmpty());
    }
}
