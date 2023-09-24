package br.com.Dourado.Cine.controller;

import br.com.Dourado.Cine.Dominio.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdmController {
    @Autowired
    UserRepository repository;




}
