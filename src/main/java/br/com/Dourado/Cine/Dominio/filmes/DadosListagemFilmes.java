package br.com.Dourado.Cine.Dominio.filmes;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosListagemFilmes(

        @NotNull
        @NotBlank
        String titulo,
        @NotNull
        @NotBlank
        String descricao,
        @NotNull
        boolean emCartaz) {
}
