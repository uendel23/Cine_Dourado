package br.com.Dourado.Cine.controller;

import br.com.Dourado.Cine.Dominio.filmes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping()
    public ResponseEntity<Page<DadosListagemFilmes>> listarFilmesEmCartaz(@PageableDefault(size = 10, sort="titulo") Pageable dados){
        var page = repository.findAllByEmCartazTrue(dados);
       return ResponseEntity.ok(page);
    }

    @GetMapping ("/{id}")
    public ResponseEntity listarFilmesId(@PathVariable Long id ){
        var filmes = repository.getReferenceById(id);
        return ResponseEntity.ok(new ListagemDetalhesFilmes(filmes));
    }




}


