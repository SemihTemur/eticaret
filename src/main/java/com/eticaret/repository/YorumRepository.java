package com.eticaret.repository;

import com.eticaret.entity.Yorum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YorumRepository extends JpaRepository<Yorum, Long> {
}
