/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.springbootproject.model;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author RAJAB IMAM
 */
@Data
public class MUser {

    private String userId;
    private String password;
    private String userName;
    private Date birthday;
    private Integer age;
    private Integer gender;
    private Integer departmentId;
    private String role;
}
