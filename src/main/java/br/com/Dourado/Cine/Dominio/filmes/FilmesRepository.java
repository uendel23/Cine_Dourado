package br.com.Dourado.Cine.Dominio.filmes;

import br.com.Dourado.Cine.Dominio.Cliente.DadosListagemClientes;
import org.hibernate.annotations.Parameter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FilmesRepository extends JpaRepository<Filmes, Long> {
    Page<DadosListagemFilmes> findAllByEmCartazTrue(Pageable dados);

}
