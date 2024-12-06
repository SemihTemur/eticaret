package com.eticaret.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class İadeRequest {

    private String mesaj;

    private Long urunId;

    private String musteriAdi;

    private String musteriSoyadi;

}
