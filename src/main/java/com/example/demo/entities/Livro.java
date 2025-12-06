package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Livro {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private Double preco;
    private Instant dataPublicacao;
    private String autor;
    private String editora;
    private Instant anoPublicacao;
    private Long isbn;
    private String genero;
    private Long quantidaDeExemplares;
    private Long exemplaresDisponiveis;

    public Livro () {
    }

    public Livro(Long id, String titulo, String descricao, Double preco, Instant dataPublicacao, String autor, String editora, Instant anoPublicacao, Long isbn, String genero, Long quantidaDeExemplares, Long exemplaresDisponiveis) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
        this.dataPublicacao = dataPublicacao;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
        this.genero = genero;
        this.quantidaDeExemplares = quantidaDeExemplares;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Instant getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Instant dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Instant getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Instant anopublicacao) {
        this.anoPublicacao = anopublicacao;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getQuantidaDeExemplares() {
        return quantidaDeExemplares;
    }

    public void setQuantidaDeExemplares(Long quantidaDeExemplares) {
        this.quantidaDeExemplares = quantidaDeExemplares;
    }

    public Long getExemplaresDisponiveis() {
        return exemplaresDisponiveis;
    }

    public void setExemplaresDisponiveis(Long exemplaresDisponiveis) {
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }
}