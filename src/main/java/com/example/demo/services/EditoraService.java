package com.example.demo.services;

import com.example.demo.entities.Autor;
import com.example.demo.entities.Editora;
import com.example.demo.repositories.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EditoraService {
    @Autowired
    private EditoraRepository repository;

    public List<Editora> findAll() {
        return repository.findAll();
    }

    public Editora findById(Long id) {
        Optional<Editora> obj = repository.findById(id);
        return obj.get();
    }
    public Editora insert(Editora obj) {
        return repository.save(obj);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
    public Editora update(Long id, Editora obj){
        Editora entity = repository.getOne(id);
        updateData(entity, obj);
        return repository.save(entity);
    }
    private void updateData(Editora entity, Editora obj){
        entity.setNome(obj.getNome());
        entity.setCnpj(obj.getCnpj());
        entity.setEndereco(obj.getEndereco());
        entity.setTelefone(obj.getTelefone());
    }
}
