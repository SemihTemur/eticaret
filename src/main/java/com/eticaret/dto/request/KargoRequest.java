package com.eticaret.dto.request;

import com.eticaret.entity.KargoFirmasi;
import com.eticaret.enums.Durum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class KargoRequest {

    private String kargoFirmasi;

    private Durum durum;

    private Double kargoUcreti;

    private LocalDate teslimTarihi;

}
