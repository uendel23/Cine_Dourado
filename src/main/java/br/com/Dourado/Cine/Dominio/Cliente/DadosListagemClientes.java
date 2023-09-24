package br.com.Dourado.Cine.Dominio.Cliente;

public record DadosListagemClientes(
        Long id,
        String nome,
        String email,
        String cpf

) {

    public DadosListagemClientes(Cliente cliente) {
        this(cliente.getId(),cliente.getNome(), cliente.getEmail(), cliente.getCpf());
    }
}
