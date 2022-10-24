package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class ApiServiceImplTest {
    @Autowired
    ApiService apiService;

    @BeforeEach
    void setUp() throws Exception{
    }

    @Test
    public void testGetUsers() throws Exception{
        List<User> data=apiService.getUsers(9);
        assertEquals(10,data.size());
    }
}