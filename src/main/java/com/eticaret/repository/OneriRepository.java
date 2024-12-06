package com.eticaret.repository;

import com.eticaret.entity.Oneri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OneriRepository extends JpaRepository<Oneri, Long> {
}
