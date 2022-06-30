/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.springbootproject.repository;

import java.util.List;
import ng.springbootproject.model.MUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author RAJAB IMAM
 */
@Mapper
public interface UserMapper {

    /**
     * User signup
     */
    public int insertOne(MUser user);

    /**
     * Get user
     */
    public List<MUser> findMany(MUser user);

    /**
     * Get user(1record)
     */
    public MUser findOne(String userId);

    /**
     * Update user
     */
    public void updateOne(@Param("userId") String userId,
            @Param("password") String password,
            @Param("userName") String userName);

    /**
     * Delete user
     */
    public int deleteOne(@Param("userId") String userId);

    /**
     * Get login user
     */
    public MUser findLoginUser(String userId);
}
