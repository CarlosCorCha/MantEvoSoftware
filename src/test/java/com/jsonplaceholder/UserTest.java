package com.jsonplaceholder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    @Test
    public void testUserEmailContainsAt() {
        User user = new User(1, "Carlos", "carlos@email.com");
        assertTrue(user.getEmail().contains("@"));
    }

    @Test
    public void testUserNameNotNull() {
        User user = new User(2, "Daniel", "daniel@email.com");
        assertNotNull(user.getName());
    }
}
