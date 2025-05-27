package com.jsonplaceholder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PostTest {
    @Test
    public void testPostTitleNotEmpty() {
        Post post = new Post(1, 101, "Título de prueba", "Contenido");
        assertFalse(post.getTitle().isEmpty());
    }

    @Test
    public void testPostBodyLength() {
        Post post = new Post(1, 101, "Título", "Este es el cuerpo del post.");
        assertTrue(post.getBody().length() > 10);
    }
}
