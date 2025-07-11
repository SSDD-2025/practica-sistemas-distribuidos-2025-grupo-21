package com.example.reservaaulas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reservaaulas.model.Aula;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Long> {
}
