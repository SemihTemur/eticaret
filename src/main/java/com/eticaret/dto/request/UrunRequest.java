package com.eticaret.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UrunRequest {

    private String ad;

    private String aciklama;

    private Double fiyat;

    private KategoriRequest kategori;

    private List<String> saticiİsmi;

    private StokRequest stok;

}
