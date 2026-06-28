package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class UserServiceTest {

    @Test
    public void testGetUserName() {

        UserRepository repository = Mockito.mock(UserRepository.class);

        when(repository.findUserById(1))
                .thenReturn(new User(1, "Rahul"));

        UserService service = new UserService(repository);

        String result = service.getUserName(1);

        assertEquals("Rahul", result);
    }
}