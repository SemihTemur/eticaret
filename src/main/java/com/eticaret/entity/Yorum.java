package com.eticaret.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "yorum")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Yorum extends BaseEntity {

    private String yorum;

    @ManyToOne
    private Musteri musteri;

    @ManyToOne
    private Urun urun;

}
