package com.eticaret.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Durum {

    BEKLEMEDE("Beklemede"),
    YOLDA("Yolda"),
    TESLİM_EDİLDİ("Teslim Edildi"),
    İADE_EDİLDİ("İade Edildi");

    private final String label;

    Durum(String label) {
        this.label = label;
    }

    @JsonValue
    public String getLabel() {
        return label;
    }

}
