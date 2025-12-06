package com.example.demo.services;

import com.example.demo.entities.Autor;
import com.example.demo.entities.Emprestimo;
import com.example.demo.repositories.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmprestimoService {
    @Autowired
    private EmprestimoRepository repository;

    public List<Emprestimo> findAll() {
        return repository.findAll();
    }

    public Emprestimo findById(Long id) {
        Optional<Emprestimo> obj = repository.findById(id);
        return obj.get();
    }
    public Emprestimo insert(Emprestimo obj) {
        return repository.save(obj);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
    public Emprestimo update(Long id, Emprestimo obj) {
        Emprestimo entity = repository.getOne(id);
        updateData(entity, obj);
        return repository.save(entity);
    }
    private void updateData(Emprestimo entity, Emprestimo obj) {
        entity.setDataEmprestimo(obj.getDataEmprestimo());
        entity.setDataDevolucaoPrevista(obj.getDataDevolucaoPrevista());
        entity.setDataDevolucaoReal(obj.getDataDevolucaoReal());
        entity.setStatus(obj.getStatus());
        entity.setLivro(obj.getLivro());
        entity.setUsuario(obj.getUsuario());
    }
}