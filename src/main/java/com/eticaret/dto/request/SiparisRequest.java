package com.eticaret.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SiparisRequest {

    private Long sepetId;

    private KargoRequest kargo;

    private String kuponİsmi;

   private OdemeRequest odemeRequest;


}
