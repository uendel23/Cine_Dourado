package br.com.Dourado.Cine;

import br.com.Dourado.Cine.Dominio.*;
import br.com.Dourado.Cine.Dominio.Cliente.Cliente;
import br.com.Dourado.Cine.Dominio.Cliente.DadosCliente;
import br.com.Dourado.Cine.Dominio.Cliente.DadosListagemClientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrarUsuaro (@RequestBody DadosCliente usuario, UriComponentsBuilder uriBuilder){
        Cliente cliente = new Cliente(usuario);
         repository.save(cliente);

         var uri = uriBuilder.path("/cliente/{id}").buildAndExpand(cliente.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadosListagemClientes(cliente));
    }

    @GetMapping
    public ResponseEntity<Page<DadosListagemClientes>> listar (@PageableDefault(size = 10, sort="nome")Pageable paginacao){

        var page = repository.findAllByAtivoTrue(paginacao);
        return ResponseEntity.ok(page);
    }


}
