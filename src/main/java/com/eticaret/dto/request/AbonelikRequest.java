package com.eticaret.dto.request;

import com.eticaret.enums.AbonelikTipi;
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
public class AbonelikRequest {

    private AbonelikTipi tip;

    private Double fiyat;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDate baslamaTarihi;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalDate bitisTarihi;

}
