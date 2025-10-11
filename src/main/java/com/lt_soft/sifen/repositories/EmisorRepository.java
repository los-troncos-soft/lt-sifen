package com.lt_soft.sifen.repositories;

import com.lt_soft.sifen.models.Emisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmisorRepository extends JpaRepository<Emisor, Long> {
}
