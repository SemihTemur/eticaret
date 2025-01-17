package com.eticaret.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "stok")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Stok extends BaseEntity {

    private int stok;

}
