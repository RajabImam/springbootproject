/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.springbootproject.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import lombok.Data;

/**
 *
 * @author RAJAB IMAM
 */
@Data
@Entity
@Table(name = "m_user")
public class MUser {

    @Id
    private String userId;
    private String password;
    private String userName;
    private Date birthday;
    private Integer age;
    private Integer gender;
    private Integer departmentId;
    private String role;
    @ManyToOne(optional = true)
    @JoinColumn(insertable = false, updatable = false, name = "departmentId")
    private Department department;
    @OneToMany
    @JoinColumn(insertable = false, updatable = false, name = "userId")
    private List<Salary> salaryList;
}
