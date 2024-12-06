package com.eticaret.repository;

import com.eticaret.entity.KargoFirmasi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KargoFirmasiRepository extends JpaRepository<KargoFirmasi, Long> {
}
