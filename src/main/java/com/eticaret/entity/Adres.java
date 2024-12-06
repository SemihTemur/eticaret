package com.eticaret.entity;

import com.eticaret.enums.KullaniciTipi;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "adres")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Adres extends BaseEntity {

    @Column(nullable = false)
    private String sehir;

    @Column(nullable = false)
    private String ilce;

    @Column(nullable = false)
    private String mahalle;

    @Column(nullable = false)
    private String sokak;

    @Enumerated(EnumType.STRING)
    private KullaniciTipi kullaniciTipi;

}
