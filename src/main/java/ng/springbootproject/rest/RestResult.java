/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.springbootproject.rest;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author RAJAB IMAM
 */
@Data
@AllArgsConstructor
public class RestResult {

    /**
     * Return code
     */
    private int result;
    /**
     * Error map key: field name value: error message
     */
    private Map<String, String> errors;
}
