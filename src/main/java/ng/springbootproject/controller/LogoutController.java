/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.springbootproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author RAJAB IMAM
 */
@Controller
@Slf4j
public class LogoutController {

    /**
     * Redirect to login screen
     */
    @PostMapping("/logout")
    public String postLogout() {
        log.info("Logout");
        return "redirect:/login";
    }
}
