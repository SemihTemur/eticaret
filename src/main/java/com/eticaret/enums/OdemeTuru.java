package com.eticaret.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OdemeTuru {

    KREDIKARTI("Kredi Kartı"),
    BANKA_TRANSFERI("Banka Transferi"),
    KAPIDA_ODEME("Kapıda Ödeme");

    private final String label;

    OdemeTuru(String label) {
        this.label = label;
    }

    @JsonValue
    public String getLabel() {
        return label;
    }

}
