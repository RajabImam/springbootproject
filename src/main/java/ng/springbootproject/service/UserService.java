/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.springbootproject.service;

import java.util.List;
import ng.springbootproject.model.MUser;

/**
 *
 * @author RAJAB IMAM
 */
public interface UserService {

    /**
     * User signup
     */
    public void signup(MUser user);

    /**
     * Get user
     */
    public List<MUser> getUsers();

    /**
     * Get user(1record)
     */
    public MUser getUserOne(String userId);

    /**
     * Update user
     */
    public void updateUserOne(String userId,
            String password,
            String userName);

    /**
     * Delete user
     */
    public void deleteUserOne(String userId);
}
