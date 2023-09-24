package br.com.Dourado.Cine.Dominio;

import br.com.Dourado.Cine.Dominio.Cliente.DadosAtualizacaoCliente;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "usuario")
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String email;
    private String cpf;

    private boolean ativo = true;

    public void atualizar(DadosAtualizacaoCliente dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.cpf = dados.cpf();
    }

}

