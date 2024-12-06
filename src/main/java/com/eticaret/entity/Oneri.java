package com.eticaret.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "oneri")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Oneri extends BaseEntity{

    private String mesaj;

    @ManyToOne
    private Satici satici;

    @ManyToOne
    private Musteri musteri;

}
