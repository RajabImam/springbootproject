/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.springbootproject.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.Data;

/**
 *
 * @author RAJAB IMAM
 */
@Embeddable
@Data
public class SalaryKey implements Serializable {

    private String userId;
    private String yearMonth;
}
