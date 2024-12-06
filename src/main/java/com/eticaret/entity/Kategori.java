package com.eticaret.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "kategori")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Kategori extends BaseEntity {

    @Column(unique = true)
    private String isim;

}
