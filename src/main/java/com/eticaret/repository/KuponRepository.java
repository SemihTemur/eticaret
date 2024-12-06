package com.eticaret.repository;

import com.eticaret.entity.Kupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KuponRepository extends JpaRepository<Kupon, Long> {
}
