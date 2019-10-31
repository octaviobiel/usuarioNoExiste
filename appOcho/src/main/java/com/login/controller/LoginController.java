package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@Autowired
	public LoginService logService;
	
    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("user", new Usuario());
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(@ModelAttribute Usuario user) {
    	return logService.verificarIngreso(user);
    }
    
    /*@PostMapping("/registro")
    public String registration(@ModelAttribute Usuario user) {
    	return logService.crearUsuario(user);
    }*/

}