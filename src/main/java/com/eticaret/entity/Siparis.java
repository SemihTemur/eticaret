package com.eticaret.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "siparis")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Siparis extends BaseEntity{

    @OneToOne
    private Sepet sepet;

    @OneToOne
    private Kargo kargo;

    @OneToOne
    private Kupon kupon;

    @OneToOne
    private Odeme odeme;
    
}
