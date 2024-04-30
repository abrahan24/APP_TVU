package com.example.tvu_sistema.Controllers.LOGIN;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



@Controller
public class login3 {


    // @RequestMapping(value = "Login2V", method = RequestMethod.GET) // Pagina principal
    // public String LoginV(HttpServletRequest request,RedirectAttributes flash, Model model,@Validated Persona persona, @Validated Usuario usuario) {

    //     model.addAttribute("generos", generoService.findAll());
    //     model.addAttribute("profesiones", profesionService.findAll());

    //     return "login/login2A";
    // }
}
