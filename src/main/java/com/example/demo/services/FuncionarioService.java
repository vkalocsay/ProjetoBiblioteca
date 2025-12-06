package com.example.demo.services;

import com.example.demo.entities.Autor;
import com.example.demo.entities.Funcionario;
import com.example.demo.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;

    public List<Funcionario> findAll() {
        return repository.findAll();
    }

    public Funcionario findById(Long id) {
        Optional<Funcionario> obj = repository.findById(id);
        return obj.get();
    }
    public Funcionario insert(Funcionario obj) {
        return repository.save(obj);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
    public Funcionario update(Long id, Funcionario obj) {
        Funcionario entity = repository.getOne(id);
        updateData(entity, obj);
        return repository.save(entity);
    }
    private void updateData(Funcionario entity,Funcionario obj){
        entity.setNome(obj.getNome());
        entity.setMatricula(obj.getMatricula());
        entity.setCargo(obj.getCargo());
        entity.setDataAdmissao(obj.getDataAdmissao());
        entity.setSalario(obj.getSalario());
    }
}
