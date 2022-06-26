/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.springbootproject.service.impl;

import java.util.List;
import ng.springbootproject.model.MUser;
import ng.springbootproject.repository.UserMapper;
import ng.springbootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author RAJAB IMAM
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    /**
     * User signup
     */
    @Override
    public void signup(MUser user) {
        user.setDepartmentId(1);
        user.setRole("ROLE_GENERAL");
        mapper.insertOne(user);
    }

    /**
     * Get user
     */
    @Override
    public List<MUser> getUsers() {
        return mapper.findMany();
    }

    /**
     * Get user(1record)
     */
    @Override
    public MUser getUserOne(String userId) {
        return mapper.findOne(userId);
    }

    /**
     * Update user
     */
    @Override
    public void updateUserOne(String userId,
            String password,
            String userName) {
        mapper.updateOne(userId, password, userName);
    }

    /**
     * Delete user
     */
    @Override
    public void deleteUserOne(String userId) {
        int count = mapper.deleteOne(userId);
    }

}
