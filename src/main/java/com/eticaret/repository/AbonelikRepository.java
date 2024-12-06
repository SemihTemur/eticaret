package com.eticaret.repository;

import com.eticaret.entity.Abonelik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbonelikRepository extends JpaRepository<Abonelik, Long> {
}
