package com.eticaret.dto.request;

import com.eticaret.enums.KullaniciTipi;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdresRequest {

    private String sehir;

    private String ilce;

    private String mahalle;

    private String sokak;

    private KullaniciTipi kullaniciTipi;

}
