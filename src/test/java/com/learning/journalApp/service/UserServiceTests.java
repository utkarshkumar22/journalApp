//package com.learning.journalApp.service;
//
//import com.learning.journalApp.entity.User;
//import com.learning.journalApp.repository.UserRepository;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ArgumentsSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
////@SpringBootTest
//public class UserServiceTests {
//    @Autowired
//    private UserRepository userRepository;
//    @Autowired
//    private UserService userService;
//
//    @ParameterizedTest
//    @ArgumentsSource(UserArgumentsProvider.class)
//    public void testSaveNewUser(User user) {
//        assertTrue(userService.saveNewUser(user));
////        assertNotNull(userRepository.findByUserName("Ram"));
//    }
//}
