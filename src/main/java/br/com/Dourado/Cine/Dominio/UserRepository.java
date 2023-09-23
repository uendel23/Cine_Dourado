package br.com.Dourado.Cine.Dominio;

import br.com.Dourado.Cine.Dominio.Cliente.DadosListagemClientes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<Users, Long> {
    Page<DadosListagemClientes> findAllByAtivoTrue(Pageable paginacao);

    @Query("""
            select p.ativo
            from Cliente p
            where
            p.id = :id
            """)
    Boolean findAtivoById(Long id);
}
