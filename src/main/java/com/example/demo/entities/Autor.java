package com.example.demo.entities;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.Date;

@Entity
public class Autor {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String nacionalidade;
    private Date datanascimento;
    private String biografia;

    public Autor() {
    }

    public Autor(Long id, String nome, String nacionalidade, Date datanascimento, String biografia) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.datanascimento = datanascimento;
        this.biografia = biografia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
}