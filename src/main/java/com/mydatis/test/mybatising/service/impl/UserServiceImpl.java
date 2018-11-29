package com.mydatis.test.mybatising.service.impl;

import com.mydatis.test.mybatising.bean.User;
import com.mydatis.test.mybatising.mapper.UserMapper;
import com.mydatis.test.mybatising.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int insertUser(User user) {
        if (user.getUsername() != null && !"".equals(user.getUsername())) {
            try {
                int effectedNum = userMapper.insertUser(user);
                if (effectedNum > 0) {
                    return effectedNum;
                } else {
                    return 0;
                }
            } catch (Exception e) {
                throw new RuntimeException();
            }
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public int updateUser(User user, Integer id) {
        return 0;
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }

    @Override
    public User selectUserById(int id) {
        return userMapper.selectUserById(id);

    }

    @Override
    public List<User> selectAllUser() {
        return null;
    }
}
