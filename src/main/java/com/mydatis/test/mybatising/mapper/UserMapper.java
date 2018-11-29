package com.mydatis.test.mybatising.mapper;

import com.mydatis.test.mybatising.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ASUS
 * @date 2018/11/27
 */
@Mapper
public interface UserMapper {
    /**
     * 新增用户
     * @param user
     * @return
     * @throws Exception
     */
    public int insertUser(User user);

    /**
     * 更新用户信息
     * @param user
     * @param id
     * @return
     * @throws Exception
     */
    public int updateUser(User user, Integer id);

    /**
     * 删除用户
     * @param id
     * @return
     * @throws Exception
     */
    public int deleteUser(int id);

    /**
     * 根据id查询用户
     * @param id
     * @return
     * @throws Exception
     */
    public User selectUserById(int id);

    /**
     * 查询所有用户
     * @return
     * @throws Exception
     */
    public List<User> selectAllUser();
}
