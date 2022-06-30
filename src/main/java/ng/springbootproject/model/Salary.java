/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.springbootproject.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author RAJAB IMAM
 */
@Data
@Entity
@Table(name = "t_salary")
public class Salary {

    // private String userId;
    // private String yearMonth;
    @EmbeddedId
    private SalaryKey salaryKey;
    private Integer salary;
}
