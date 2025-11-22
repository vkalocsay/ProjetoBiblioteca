package com.example.demo.entities;


import jakarta.persistence.*;
import org.hibernate.Length;
import org.hibernate.boot.model.source.internal.hbm.PluralAttributeElementSourceBasicImpl;

import java.time.Instant;

@Entity
public class Funcionario {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer matricula;
    private String cargo;
    private Instant dataadmissao;
    private Long salario;

    public Funcionario() {
    }

    public Funcionario(Long id, String nome, Integer matricula, String cargo, Instant dataadmissao, Long salario) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.cargo = cargo;
        this.dataadmissao = dataadmissao;
        this.salario = salario;
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

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Instant getDataadmissao() {
        return dataadmissao;
    }

    public void setDataadmissao(Instant dataadmissao) {
        this.dataadmissao = dataadmissao;
    }

    public Long getSalario() {
        return salario;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }
}