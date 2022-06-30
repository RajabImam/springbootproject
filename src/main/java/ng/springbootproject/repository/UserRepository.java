/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.springbootproject.repository;

import ng.springbootproject.model.MUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author RAJAB IMAM
 */
public interface UserRepository extends JpaRepository<MUser, String> {

    /**
     * Login user search
     */
    @Query("select user"
            + " from MUser user"
            + " where userId = :userId")
    public MUser findLoginUser(@Param("userId") String userId);

    /**
     * User update
     */
    @Modifying
    @Query("update MUser"
            + " set"
            + " password = :password"
            + " , userName = :userName"
            + " where"
            + " userId = :userId")
    public Integer updateUser(@Param("userId") String userId,
            @Param("password") String password,
            @Param("userName") String userName);
}
