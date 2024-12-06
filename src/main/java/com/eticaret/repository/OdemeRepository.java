package com.eticaret.repository;

import com.eticaret.entity.Odeme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdemeRepository extends JpaRepository<Odeme, Long> {
}
