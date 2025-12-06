package com.example.demo.services;

import com.example.demo.entities.Autor;
import com.example.demo.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository repository;

    public List<Autor> findAll() { return repository.findAll(); }

    public Autor findById(Long id) {
        Optional<Autor> obj = repository.findById(id);
        return obj.get();
    }
     public Autor insert(Autor obj) {
        return repository.save(obj);
     }
    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Autor update(Long id, Autor obj){
        Autor entity = repository.getOne(id);
        updateData(entity, obj);
        return repository.save(entity);
    }
    private void updateData(Autor entity, Autor obj) {
        entity.setNome(obj.getNome());
        entity.setNacionalidade(obj.getNacionalidade());
        entity.setDataNascimento(obj.getDataNascimento());
        entity.setBiografia(obj.getBiografia());
    }
}
