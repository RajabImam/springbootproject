/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.springbootproject.controller;

import java.util.List;
import ng.springbootproject.model.MUser;
import ng.springbootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author RAJAB IMAM
 */
@Controller
@RequestMapping("/user")
public class UserListController {

    @Autowired
    private UserService userService;

    /**
     * Display user list screen
     */
    @GetMapping("/list")
    public String getUserList(Model model) {
        // Get user list
        List<MUser> userList = userService.getUsers();
        // Registered in Model
        model.addAttribute("userList", userList);
        // Display user list screen
        return "user/list";
    }

}
