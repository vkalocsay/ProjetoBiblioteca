package com.example.demo.services;

import com.example.demo.entities.Autor;
import com.example.demo.entities.Biblioteca;
import com.example.demo.repositories.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BibliotecaService {
    @Autowired
    private BibliotecaRepository repository;

    public List<Biblioteca> findAll() {
        return repository.findAll();
    }

    public Biblioteca findById(Long id) {
        Optional<Biblioteca> obj = repository.findById(id);
        return obj.get();
    }
    public Biblioteca insert(Biblioteca obj) {
        return repository.save(obj);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
    public Biblioteca update(Long id, Biblioteca obj) {
        Biblioteca entity = repository.getOne(id);
        updateData(entity, obj);
        return repository.save(entity);
    }
    private void updateData(Biblioteca entity, Biblioteca obj) {
        entity.setEndereco(obj.getEndereco());
        entity.setTelefone(obj.getTelefone());
        entity.setListaDeLivros(obj.getListaDeLivros());
        entity.setListaDeUsuarios(obj.getListaDeUsuarios());
        entity.setFuncionarios(obj.getFuncionarios());
    }
}
