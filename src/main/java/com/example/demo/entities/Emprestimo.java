package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Date;

@Entity
public class Emprestimo {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant dataemprestimo;
    private Instant datadevolucaoprevista;
    private Instant datadevolucaoreal;
    private String status;
    private String livro;
    private String usuario;

    public Emprestimo() {
    }

    public Emprestimo(Long id, Instant dataemprestimo, Instant datadevolucaoprevista, Instant datadevolucaoreal, String status, String livro, String usuario) {
        this.id = id;
        this.dataemprestimo = dataemprestimo;
        this.datadevolucaoprevista = datadevolucaoprevista;
        this.datadevolucaoreal = datadevolucaoreal;
        this.status = status;
        this.livro = livro;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getDataemprestimo() {
        return dataemprestimo;
    }

    public void setDataemprestimo(Instant dataemprestimo) {
        this.dataemprestimo = dataemprestimo;
    }

    public Instant getDatadevolucaoprevista() {
        return datadevolucaoprevista;
    }

    public void setDatadevolucaoprevista(Instant datadevolucaoprevista) {
        this.datadevolucaoprevista = datadevolucaoprevista;
    }

    public Instant getDatadevolucaoreal() {
        return datadevolucaoreal;
    }

    public void setDatadevolucaoreal(Instant datadevolucaoreal) {
        this.datadevolucaoreal = datadevolucaoreal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}