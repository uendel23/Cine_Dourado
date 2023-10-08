package br.com.Dourado.Cine.controller;

import br.com.Dourado.Cine.Dominio.filmes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmesController {
    @Autowired
    FilmesRepository repository;


    @PostMapping
    @Transactional
    public ResponseEntity cadastrar (@RequestBody DadosFilme dados){
        Filmes filmes = new Filmes(dados);

        repository.save(filmes);

        return  ResponseEntity.ok(filmes);
    }


    public ResponseEntity<DadosListagemFilmes> listarFilmesEmCartaz(@RequestBody DadosListagemFilmes dados){
        repository.findAllByEmCartazTrue(dados);
       return ResponseEntity.ok(dados);
    }



}


