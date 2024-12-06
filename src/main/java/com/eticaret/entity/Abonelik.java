package com.eticaret.entity;

import com.eticaret.enums.AbonelikTipi;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "abonelik")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Abonelik extends BaseEntity{

    @Enumerated(EnumType.STRING) // Enum değerini String olarak kaydeder
    private AbonelikTipi tip;

    private Double fiyat;

    private LocalDate baslamaTarihi;

    private LocalDate bitisTarihi;

}
