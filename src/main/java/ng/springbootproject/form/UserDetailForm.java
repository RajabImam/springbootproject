/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.springbootproject.form;

import java.util.Date;
import java.util.List;
import lombok.Data;
import ng.springbootproject.model.Department;
import ng.springbootproject.model.Salary;

/**
 *
 * @author RAJAB IMAM
 */
@Data
public class UserDetailForm {

    private String userId;
    private String password;
    private String userName;
    private Date birthday;
    private Integer age;
    private Integer gender;
    private Department department ;
    private List<Salary> salaryList ;
}
