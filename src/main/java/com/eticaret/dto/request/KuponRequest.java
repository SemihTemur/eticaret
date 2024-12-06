package com.eticaret.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class KuponRequest {

    private String kod;  // Kupon kodu (örn: "YAZINDISCOUNT")

    private Double indirimTutarı;  // Kuponun sağladığı indirim (örn: 20%)

    private LocalDate gecerlilikTarihi;

}
