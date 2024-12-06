package com.eticaret.entity;

import com.eticaret.enums.OdemeDurumu;
import com.eticaret.enums.OdemeTuru;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "odeme")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Odeme extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private OdemeTuru odemeTuru;

    @Enumerated(EnumType.STRING)
    private OdemeDurumu odemeDurumu;

    private Double tutar;

}
