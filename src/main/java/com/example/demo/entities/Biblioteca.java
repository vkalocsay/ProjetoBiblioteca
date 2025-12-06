package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Biblioteca {

   @Id
   @Column(length = 11)
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String endereco;
   private String telefone;
   private List listaDeLivros;
   private List listaDeUsuarios;
   private String funcionarios;

   public Biblioteca() {
   }

   public Biblioteca(Long id, String endereco, String telefone, List listaDeLivros, List listaDeUsuarios, String funcionarios) {
      this.id = id;
      this.endereco = endereco;
      this.telefone = telefone;
      this.listaDeLivros = listaDeLivros;
      this.listaDeUsuarios = listaDeUsuarios;
      this.funcionarios = funcionarios;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
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

   public List getListaDeLivros() {
      return listaDeLivros;
   }

   public void setListaDeLivros(List listaDeLivros) {
      this.listaDeLivros = listaDeLivros;
   }

   public List getListaDeUsuarios() { return listaDeUsuarios;
   }

   public void setListaDeUsuarios(List listaDeUsuarios) {
      this.listaDeUsuarios = listaDeUsuarios;
   }

   public String getFuncionarios() { return funcionarios;
   }

   public void setFuncionarios(String funcionarios) {
      this.funcionarios = funcionarios;
   }
}