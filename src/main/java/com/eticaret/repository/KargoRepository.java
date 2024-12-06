package com.eticaret.repository;

import com.eticaret.entity.Kargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KargoRepository extends JpaRepository<Kargo, Long> {
}
