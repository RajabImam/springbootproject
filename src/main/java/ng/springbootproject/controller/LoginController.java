/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.springbootproject.controller;

/**
 *
 * @author RAJAB IMAM
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    /**
     * Display login screen
     */
    @GetMapping("/login")
    public String getLogin() {
        return "login/login";
    }

    /**
     * Redirect to user list screen
     */
    @PostMapping("/login")
    public String postLogin() {
        return "redirect:/user/list";
    }
}
