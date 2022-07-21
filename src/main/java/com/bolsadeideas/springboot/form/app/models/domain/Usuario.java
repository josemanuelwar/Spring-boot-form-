/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bolsadeideas.springboot.form.app.models.domain;

import javax.validation.constraints.NotEmpty;

public class Usuario {
    
    private String identificador;
    
    @NotEmpty
    private String username;
    
    @NotEmpty
    private String Apellidos;
    
    @NotEmpty
    private String nombre;
    
    @NotEmpty
    private String password;
    
    
    @NotEmpty
    private String email;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    
    
    
}
