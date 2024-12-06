package com.eticaret.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "kargofirmasi")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class KargoFirmasi extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String firmaAdi;

    @Column(unique = true, nullable = false)
    private String telefon;

}
