package com.eticaret.entity;

import com.eticaret.enums.Rol;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "musteri",uniqueConstraints = {@UniqueConstraint(columnNames = {"ad","soyad"})
})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Musteri extends BaseEntity {

    private String ad;
    private String soyad;
    private String email;
    private String telefonNumarasi;  // Müşterinin telefon numarası

    private String sifre;  // Müşterinin şifresi

    @Enumerated(EnumType.STRING)
    private Rol rol;

    private LocalDate dogumTarihi;  // Müşterinin doğum tarihi

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adres_id")
    private Adres adres;

    @OneToOne(cascade = CascadeType.ALL)
    private Abonelik abonelik;
}
