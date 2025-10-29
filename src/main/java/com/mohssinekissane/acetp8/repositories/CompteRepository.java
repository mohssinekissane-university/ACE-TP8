package com.mohssinekissane.acetp7.repositories;

import com.mohssinekissane.acetp7.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}