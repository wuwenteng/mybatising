package com.mydatis.test.mybatising.mapper;

import com.mydatis.test.mybatising.bean.User;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;
    @Test
    @Ignore
    public void insertUser() {
    }

    @Test
    @Ignore
    public void updateUser() {
    }

    @Test
    @Ignore
    public void deleteUser() {
    }

    @Test
    @Ignore
    public void selectUserById() {
    }

    @Test
    public void selectAllUser() throws Exception {
        List<User> users = userMapper.selectAllUser();
        assertEquals(2,users.size());
    }
}