//package com.learning.journalApp.service;
//
//import com.learning.journalApp.entity.User;
//import com.learning.journalApp.repository.UserRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.ArrayList;
//
//import static org.mockito.Mockito.*;
//
//
//public class UserDetailServiceImplTests {
////    @InjectMocks
////    private UserDetailServiceImpl userDetailServiceImpl;
////
////    @Mock
////    private UserRepository userRepository;
////
////    @BeforeEach
////    void setUp() {
////        MockitoAnnotations.initMocks(this);
////    }
////
////    @Test
////    void loadUserByUsernameTest() {
////        when(userRepository.findByUserName(ArgumentMatchers.anyString()))
////                .thenReturn(User.builder().
////                        userName("Ram").
////                        password("password").
////                        roles(new ArrayList<>()).
////                        build());
////        UserDetails user = userDetailServiceImpl.loadUserByUsername("Ram");
////    }
//}
