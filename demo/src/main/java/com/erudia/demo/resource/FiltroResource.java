package com.erudia.demo.resource;

import com.FiltroAndReco.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/filtros") // "/buscar"
public class FiltroResource{

    //@Autowired
    //private Filtro f;
    private Buscar b;

//    @PostMapping
//http://localhost:8080/filtros/coisa
    @GetMapping("/{buscar}")
    public String buscar(@PathVariable String buscar){
        b = new Buscar();
        try{
            Thread.sleep(5000);

        } catch(Exception e){
            e.printStackTrace();
        }
        return b.relacionados(buscar);
    }

    
    

}