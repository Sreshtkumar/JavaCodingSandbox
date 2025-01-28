package com.assignment.sbassignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

public class UserControllerTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserController userController;

    private User testUser;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        testUser = new User(null, "John Doe", "johndoe@example.com");
    }

    @Test
    void testAddUser() {
        when(userRepository.save(any(User.class))).thenReturn(testUser);

        User createdUser = userController.addUser(testUser);
        assertThat(createdUser.getName()).isEqualTo("John Doe");
        assertThat(createdUser.getEmail()).isEqualTo("johndoe@example.com");
    }

    @Test
    void testGetAllUsers() {
        when(userRepository.findAll()).thenReturn(List.of(testUser));

        var users = userController.getAllUsers();
        assertThat(users).hasSize(1);
        assertThat(users.get(0).getName()).isEqualTo("John Doe");
    }

    @Test
    void testGetUserById() {
        when(userRepository.findById(1L)).thenReturn(Optional.of(testUser));

        ResponseEntity<User> response = userController.getUserById(1L);
        assertThat(response.getStatusCodeValue()).isEqualTo(200);
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().getName()).isEqualTo("John Doe");
    }

    @Test
    void testGetUserByIdNotFound() {
        when(userRepository.findById(1L)).thenReturn(Optional.empty());

        ResponseEntity<User> response = userController.getUserById(1L);
        assertThat(response.getStatusCodeValue()).isEqualTo(404);
    }

    @Test
    void testUpdateUser() {
        when(userRepository.existsById(1L)).thenReturn(true);
        when(userRepository.save(any(User.class))).thenReturn(testUser);

        ResponseEntity<User> response = userController.updateUser(1L, testUser);
        assertThat(response.getStatusCodeValue()).isEqualTo(200);
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().getName()).isEqualTo("John Doe");
    }

    @Test
    void testUpdateUserNotFound() {
        when(userRepository.existsById(1L)).thenReturn(false);

        ResponseEntity<User> response = userController.updateUser(1L, testUser);
        assertThat(response.getStatusCodeValue()).isEqualTo(404);
    }

    @Test
    void testDeleteUser() {
        when(userRepository.existsById(1L)).thenReturn(true);

        ResponseEntity<Void> response = userController.deleteUser(1L);
        assertThat(response.getStatusCodeValue()).isEqualTo(204);

        verify(userRepository, times(1)).deleteById(1L);
    }

    @Test
    void testDeleteUserNotFound() {
        when(userRepository.existsById(1L)).thenReturn(false);

        ResponseEntity<Void> response = userController.deleteUser(1L);
        assertThat(response.getStatusCodeValue()).isEqualTo(404);

        verify(userRepository, never()).deleteById(1L);
    }
}
