package com.example.demo.repositories;

import com.example.demo.entities.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, Long> {
}
