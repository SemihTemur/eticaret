package com.eticaret.entity;

import com.eticaret.enums.Rol;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "satici",uniqueConstraints = {@UniqueConstraint(columnNames = {"ad","soyad"})
})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Satici extends BaseEntity{

    private String ad;  // Mağaza adı veya satıcı adı

    private String soyad;

    private String eposta;  // Satıcı e-posta adresi

    private String telefon;  // Telefon numarası

    @Enumerated(EnumType.STRING)
    private Rol rol;

    @OneToOne
    @JoinColumn(name = "adres_id")
    private Adres adres;
}

