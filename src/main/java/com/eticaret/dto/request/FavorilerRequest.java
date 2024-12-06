package com.eticaret.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FavorilerRequest {

    private String musteriAdi;

    private String musteriSoyadi;

    private Long urunId;

}
