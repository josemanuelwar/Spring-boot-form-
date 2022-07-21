/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolsadeideas.springboot.form.app.controller;

import com.bolsadeideas.springboot.form.app.models.domain.Usuario;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 *
 * @author sasuke
 */
@Controller
@SessionAttributes("usuario")
public class FromController {
    
    @GetMapping("/form")
    public String form(Model model){
        Usuario usuario = new Usuario();
        usuario.setNombre("jose manuel");
        usuario.setApellidos("sanchez juarez");
        usuario.setIdentificador("123.456.789-k");
        model.addAttribute("titulo", "Formulario de un usuario");
        model.addAttribute("usuario", usuario);
        return "form";
    }
    /*forma manual*/
    @PostMapping("/form")
    public String procesar(@Valid Usuario usuario,BindingResult result,Model model,SessionStatus status){       
        model.addAttribute("titulo","Resultado del formulario");
        if(result.hasErrors()){
           return "form";
        }
        model.addAttribute("usuario", usuario);
        status.setComplete();
        return "resultado";
    }
    
}
