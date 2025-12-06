package com.example.demo.services;

import com.example.demo.entities.Autor;
import com.example.demo.entities.Livro;
import com.example.demo.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private LivroRepository repository;

    public List<Livro> findAll() {
        return repository.findAll();
    }

    public Livro findById(Long id) {
        Optional<Livro> obj = repository.findById(id);
        return obj.get();
    }
    public Livro insert(Livro obj) {
        return repository.save(obj);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
    public Livro update(Long id,Livro obj) {
        Livro entity = repository.getOne(id);
        updateData(entity, obj);
        return repository.save(entity);
    }
    private void updateData(Livro entity, Livro obj) {
        entity.setTitulo(obj.getTitulo());
        entity.setDescricao(obj.getDescricao());
        entity.setPreco(obj.getPreco());
        entity.setDataPublicacao(obj.getDataPublicacao());
        entity.setAutor(obj.getAutor());
        entity.setEditora(obj.getEditora());
        entity.setAnoPublicacao(obj.getAnoPublicacao());
        entity.setIsbn(obj.getIsbn());
        entity.setGenero(obj.getGenero());
        entity.setQuantidaDeExemplares(obj.getQuantidaDeExemplares());
        entity.setExemplaresDisponiveis(obj.getExemplaresDisponiveis());
    }
}
