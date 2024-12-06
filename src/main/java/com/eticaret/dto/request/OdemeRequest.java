package com.eticaret.dto.request;

import com.eticaret.enums.OdemeDurumu;
import com.eticaret.enums.OdemeTuru;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OdemeRequest {

    private OdemeTuru odemeTuru;

    private OdemeDurumu odemeDurumu;

    private Double tutar;

}
