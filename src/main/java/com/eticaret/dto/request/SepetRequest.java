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
public class SepetRequest {

    private String musteriAd;

    private String musteriSoyad;

    private List<Long> urunList;

    private int urunSayisi;
}
