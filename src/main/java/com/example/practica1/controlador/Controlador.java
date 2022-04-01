package com.example.practica1.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Controlador {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/tunombre")
    public String tunombre(HttpServletRequest request, Model model ) {
        String nombre = request.getParameter("nombre");
        System.out.println("nombre -> " + nombre);
        model.addAttribute("nombre", nombre);
        return "nombres";
    }

}
