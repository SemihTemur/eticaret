package com.eticaret.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "kupon")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Kupon extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String kod;  // Kupon kodu (örn: "YAZINDISCOUNT")

    private Double indirimTutarı;  // Kuponun sağladığı indirim (örn: 20%)

    private LocalDate gecerlilikTarihi;

}
