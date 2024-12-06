package com.eticaret.dto.request;

import com.eticaret.enums.Rol;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SaticiRequest {

    private String adi;  // Mağaza adı veya satıcı adı

    private String soyad;

    private String eposta;  // Satıcı e-posta adresi

    private String telefon;  // Telefon numarası

    private Rol rol;

    private AdresRequest adres;

}
