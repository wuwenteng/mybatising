package com.mydatis.test.mybatising.service;

import com.mydatis.test.mybatising.bean.User;

import java.util.List;

public interface UserService {
    /**
     * 新增用户
     * @param user
     * @return
     * @throws Exception
     */
    public int insertUser(User user) throws Exception;

    /**
     * 更新用户信息
     * @param user
     * @param id
     * @return
     * @throws Exception
     */
    public int updateUser(User user, Integer id) throws Exception;

    /**
     * 删除用户
     * @param id
     * @return
     * @throws Exception
     */
    public int deleteUser(int id) throws Exception;

    /**
     * 根据id查询用户
     * @param id
     * @return
     * @throws Exception
     */
    public User selectUserById(int id) throws Exception;

    /**
     * 查询所有用户
     * @return
     * @throws Exception
     */
    public List<User> selectAllUser() throws Exception;
}
