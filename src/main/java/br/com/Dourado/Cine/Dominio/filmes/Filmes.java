package br.com.Dourado.Cine.Dominio.filmes;

import br.com.Dourado.Cine.Dominio.filmes.DadosFilme;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "filmes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Filmes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String descricao;
    private boolean emCartaz = true;


    public Filmes(DadosFilme dados) {
        this.titulo = dados.titulo();
        this.descricao = dados.descricao();
    }
}
