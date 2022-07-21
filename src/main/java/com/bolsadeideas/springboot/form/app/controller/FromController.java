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
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.HashMap;
import java.util.Map;
//import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author sasuke
 */
@Controller
public class FromController {
    
    @GetMapping("/form")
    public String form(Model model){
        Usuario usuario = new Usuario();
        model.addAttribute("titulo", "Formulario de un usuario");
        model.addAttribute("usuario", usuario);
        return "form";
    }
    /*forma manual*/
    @PostMapping("/form")
    public String procesar(@Valid Usuario usuario,BindingResult result,Model model){       
        model.addAttribute("titulo","Resultado del formulario");
        if(result.hasErrors()){
           Map<String,String> errores= new HashMap<>();
           result.getFieldErrors().forEach(err -> {
            errores.put(err.getField(),"El campo ".concat(err.getField()).concat(" ").concat(err.getDefaultMessage()));
            });
           model.addAttribute("error", errores);
           return "form";
        }
        model.addAttribute("usuario", usuario);
        return "resultado";
    }
    
}
