package com.eticaret.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "sepet")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Sepet extends BaseEntity {

    @OneToOne
    private Musteri musteri;

    @ManyToMany
    private List<Urun> urun;

    private int urunSayisi;

}
