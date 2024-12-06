package com.eticaret.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Rol {

    ADMIN("Admin"),
    MUSTERI("Müşteri"),
    SATICI("Satici");

    private final String label;

    Rol(String label) {
        this.label = label;
    }

    @JsonValue
    public String getLabel() {
        return label;
    }

}
