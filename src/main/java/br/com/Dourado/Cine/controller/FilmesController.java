package br.com.Dourado.Cine.controller;

import br.com.Dourado.Cine.Dominio.Filmes;
import br.com.Dourado.Cine.Dominio.filmes.DadosFilme;
import br.com.Dourado.Cine.Dominio.filmes.FilmesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filmes")
public class FilmesController {
    @Autowired
    FilmesRepository repository;

    public ResponseEntity cadastrar (@RequestBody DadosFilme dados){
        Filmes filmes = new Filmes(dados);

        repository.save(filmes);

        return  ResponseEntity.ok(filmes);
    }


}
