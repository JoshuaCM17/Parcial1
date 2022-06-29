/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba1.service;
import com.prueba1.entity.Concierto;
import com.prueba1.repository.ConciertoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Asus
 */
public class ConciertoService implements IConciertoService{
    
    @Autowired
    private ConciertoRepository conciertoRepository;
    
    @Override
    public List<Concierto> getAllConcierto(){
        return (List<Concierto>)conciertoRepository.findAll();
    }
    
    @Override
    public Concierto getConciertoById(long id){
        return conciertoRepository.findOne(id);
    }
    
    @Override
    public void saveConcierto(Concierto concierto){
        conciertoRepository.save(concierto);
    }
    
    @Override
    public void delete(long id){
        conciertoRepository.delete(id);
    }
}
