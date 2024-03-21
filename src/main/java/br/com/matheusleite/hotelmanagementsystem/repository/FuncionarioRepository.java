package br.com.matheusleite.hotelmanagementsystem.repository;

import br.com.matheusleite.hotelmanagementsystem.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
