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
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author RAJAB IMAM
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Autowired
    private PasswordEncoder encoder;

    /**
     * User signup
     */
    @Override
    public void signup(MUser user) {
        user.setDepartmentId(1);
        user.setRole("ROLE_GENERAL");
        // Password encryption
        String rawPassword = user.getPassword();
        user.setPassword(encoder.encode(rawPassword));
        mapper.insertOne(user);
    }

    /**
     * Get user
     */
    @Override
    public List<MUser> getUsers(MUser user) {
        return mapper.findMany(user);
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
    @Transactional
    @Override
    public void updateUserOne(String userId,
            String password,
            String userName) {
        // Password encryption
        String encryptPassword = encoder.encode(password);
        mapper.updateOne(userId, encryptPassword, userName);

        // Raise an exception
        //int i = 1 / 0;
    }

    /**
     * Delete user
     */
    @Override
    public void deleteUserOne(String userId) {
        int count = mapper.deleteOne(userId);
    }

    /**
     * Get login user information
     */
    @Override
    public MUser getLoginUser(String userId) {
        return mapper.findLoginUser(userId);
    }

}
