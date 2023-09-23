package br.com.Dourado.Cine.Dominio;

import br.com.Dourado.Cine.Dominio.Cliente.DadosCliente;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "adm")
@Table(name = "administrador")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Adm extends Users{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Adm (DadosCliente dados) {
        super.setName(dados.nome());
        super.setEmail(dados.email());
        super.setCPF(dados.cpf());

    }

}
