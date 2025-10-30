package com.mohssinekissane.acetp8.repositories;

import com.mohssinekissane.acetp8.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
}