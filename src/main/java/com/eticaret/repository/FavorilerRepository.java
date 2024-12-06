package com.eticaret.repository;

import com.eticaret.entity.Favoriler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavorilerRepository extends JpaRepository<Favoriler,Long> {
}
