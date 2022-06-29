/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba1.controller;
import com.prueba1.entity.Concierto;
import com.prueba1.service.IConciertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author Asus
 */
public class ConciertoController {
    
    @Autowired
    private IConciertoService conciertoService;
    
    @GetMapping("/Concierto")
    public String index (Model model){
        List<Concierto> listaConcierto = conciertoService.getAllConcierto();
        model.addAttribute("titulo", "Concierto");
        model.addAttribute("concierto",listaConcierto);
        return "concierto";
    }
    
}
