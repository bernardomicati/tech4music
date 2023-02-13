package br.com.tech4me.tech4music.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.tech4music.model.Musica;

@RestController
@RequestMapping("/api/produtos")
public class MusicaController {
    
    @Autowired
    private MusicaController service;

    @GetMapping
    public List<Musica> obterTodos() {
        return service.obterTodos();
    }

    @PostMapping
    public Musica criarProduto(@RequestBody Musica produto) { 
        return service.criarProduto(produto);
    }

}