package com.eticaret.repository;

import com.eticaret.entity.Satici;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaticiRepository extends JpaRepository<Satici, Long> {
}
