package br.com.Dourado.Cine.Dominio.filmes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmesRepository extends JpaRepository<Filmes, Long> {
}
