package com.eticaret.dto.request;

import com.eticaret.enums.Rol;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MusteriRequest {

    private String ad;
    private String soyad;
    private String email;
    private String telefonNumarasi;  // Müşterinin telefon numarası

    private String sifre;  // Müşterinin şifresi

    private Rol rol;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDate dogumTarihi;  // Müşterinin doğum tarihi

    private AdresRequest adres;

    private AbonelikRequest abonelik;

}
