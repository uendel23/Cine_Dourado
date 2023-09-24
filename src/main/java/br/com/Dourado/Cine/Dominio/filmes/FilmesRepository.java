package br.com.Dourado.Cine.Dominio.filmes;

import br.com.Dourado.Cine.Dominio.Filmes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmesRepository extends JpaRepository<Filmes, Long> {
}
