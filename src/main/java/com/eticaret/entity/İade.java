package com.eticaret.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "iade")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class İade extends BaseEntity {

    private String aciklama;

    @OneToOne
    private Urun urun;

    @ManyToOne
    private Musteri musteri;
}
