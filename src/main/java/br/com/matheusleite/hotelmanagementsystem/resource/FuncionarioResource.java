package br.com.matheusleite.hotelmanagementsystem.resource;

import br.com.matheusleite.hotelmanagementsystem.entity.Funcionario;
import br.com.matheusleite.hotelmanagementsystem.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/funcionario")
public class FuncionarioResource {

    @Autowired
    private FuncionarioRepository repo;

    @GetMapping
    public List<Funcionario> findAll() {
        return repo.findAll();
    }

    @GetMapping(value = "/{id}")
    public Funcionario findById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Transactional
    @PostMapping
    public Funcionario save(@RequestBody Funcionario funcionario) {
        return repo.save(funcionario);
    }
}
