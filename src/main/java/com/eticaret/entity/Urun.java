package com.eticaret.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "urun")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Urun extends BaseEntity {

    private String ad;  // Ürün adı

    private String aciklama;  // Ürün açıklaması

    private Double fiyat;  // Ürün fiyatı

    @ManyToOne
    @JoinColumn(name = "kategori_id")
    private Kategori kategori;  // Ürünün kategorisi

    @ManyToMany
    private List<Satici> satici;

    @OneToOne
    private Stok stok;

}
