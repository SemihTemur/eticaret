package com.eticaret.enums;

public enum OdemeDurumu {
    BEKLEMEDE("Beklemede"),
    ONAYLI("Onaylı"),
    GERCEKLESTI("Gerçekleşti"),
    IPTAL("İptal");

    private final String label;

    OdemeDurumu(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

