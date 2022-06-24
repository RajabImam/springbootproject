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
import java.util.Locale;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import ng.springbootproject.form.SignUpForm;
import ng.springbootproject.service.UserApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@Slf4j
public class SignUpController {

    @Autowired
    private UserApplicationService userApplicationService;

    /**
     * Display the user signup screen
     */
    @GetMapping("/signup")
    public String getSignup(Model model, Locale locale, @ModelAttribute SignUpForm form) {
        // Get gender
        Map<String, Integer> genderMap = userApplicationService.getGenderMap(locale);

        model.addAttribute("genderMap", genderMap);
        // Transition to user signup screen
        return "user/signup";
    }

    /**
     * User signup process
     */
    @PostMapping("/signup")
    public String postSignup(Model model, Locale locale,
            @ModelAttribute @Validated SignUpForm form,
            BindingResult bindingResult) {
        // Input check result
        if (bindingResult.hasErrors()) {
        // NG: Return to the user signup screen
            return getSignup(model, locale, form);
        }
        log.info(form.toString());
        // Redirect to login screen
        return "redirect:/login";
    }
}
