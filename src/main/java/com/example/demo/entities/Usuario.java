package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Usuario {
    @Id
    @Column(length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private Instant datacadastro;
    private Integer emprestimosativos;

    public Usuario() {
    }
    public Usuario(Long id, String nome, String cpf, String endereco, String telefone, String email, Instant datacadastro, Integer emprestimosativos) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.datacadastro = datacadastro;
        this.emprestimosativos = emprestimosativos;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Instant getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Instant datacadastro) {
        this.datacadastro = datacadastro;
    }


    
    public Integer getEmprestimosativos() {
        return emprestimosativos;
    }

    public void setEmprestimosativos(Integer emprestimosativos) {
        this.emprestimosativos = emprestimosativos;
    }

}



