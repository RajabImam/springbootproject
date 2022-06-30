/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.springbootproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author RAJAB IMAM
 */
@Controller
public class AdminController {

    /**
     * Transition to the admin authority only screen
     */
    @GetMapping("/admin")
    public String getAdmin() {
        return "admin/admin";
    }
}
