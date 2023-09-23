package br.com.Dourado.Cine.Dominio.Cliente;

import br.com.Dourado.Cine.Dominio.Users;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Cliente")
@Table(name = "Clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Cliente extends Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Cliente(DadosCliente dados) {
        super.setNome(dados.nome());
        super.setEmail(dados.email());
        super.setCPF(dados.cpf());

    }
}
