package br.com.Dourado.Cine.Dominio;

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
    private String CPF;
    private boolean ativo = true;
}
