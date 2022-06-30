/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.springbootproject.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author RAJAB IMAM
 */
@Data
@Entity
@Table (name="m_department" )
public class Department {

    @Id
    private Integer departmentId;
    private String departmentName;
}
