package com.erudia.demo.resource;

import java.util.HashMap;

import javax.annotation.Generated;

import com.FiltroAndReco.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/requisitar")
public class RequisicaoResource {

    @GetMapping("/busca/{pesquisa}/{categoria}/{valormin}/{valormax}/{ordenacao}")
    public HashMap<String, Object> buscar(@PathVariable String pesquisa, @PathVariable String categoria, @PathVariable String valormin, @PathVariable String valormax, @PathVariable String ordenacao ) {
        HashMap<String, Object> map = new HashMap<>();
        Buscar algDeBusca = new Buscar();
        return null;
    }

    @GetMapping("/maispop")
    public HashMap<String, Object> buscarMaisPopulares() {
        HashMap<String, Object> map = new HashMap<>();
        return null;
    }

    @GetMapping("/cliente/{id}")
    public HashMap<String, Object> recomendacao(@PathVariable int id) {
        return null;
    }
    



}