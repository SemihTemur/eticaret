package com.eticaret.repository;

import com.eticaret.entity.Sepet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SepetRepository extends JpaRepository<Sepet, Long> {
}
