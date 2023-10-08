package br.com.Dourado.Cine.Dominio.filmes;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ListagemDetalhesFilmes( Long id, String titulo,String descricao,boolean emCartaz) {
        public ListagemDetalhesFilmes( Filmes filmes){
                this(filmes.getId(), filmes.getTitulo(), filmes.getDescricao(), filmes.isEmCartaz());
        }

}
