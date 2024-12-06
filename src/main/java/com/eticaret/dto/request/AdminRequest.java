package com.eticaret.dto.request;

import com.eticaret.enums.Rol;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdminRequest {

    private String name;

    private String password;

    @Enumerated(EnumType.STRING)
    private Rol rol;

}
