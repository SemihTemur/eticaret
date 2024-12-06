package com.eticaret.entity;

import com.eticaret.enums.Durum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "kargo")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Kargo extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "kargo_firmasi_id", nullable = false)
    private KargoFirmasi kargoFirmasi;

    @Enumerated(EnumType.STRING)
    private Durum durum;

    private Double kargoUcreti;

    private LocalDate teslimTarihi;

}
