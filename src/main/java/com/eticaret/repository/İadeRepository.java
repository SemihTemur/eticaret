package com.eticaret.repository;

import com.eticaret.entity.İade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface İadeRepository extends JpaRepository<İade, Long> {
}
