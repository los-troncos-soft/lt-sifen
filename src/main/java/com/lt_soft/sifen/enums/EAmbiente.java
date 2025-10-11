package com.lt_soft.sifen.enums;

import java.util.Arrays;

public enum EAmbiente {
    TEST((short) 0, "TEST"),
    PRODUCCION((short) 1, "PRODUCCION");

    private short val;
    private String descripcion;

    EAmbiente(short val, String descripcion) {
        this.val = val;
        this.descripcion = descripcion;
    }

    public static EAmbiente getByVal(short val) {
        return Arrays.stream(EAmbiente.values()).filter(e -> e.val == val).findFirst().orElse(null);
    }

    public short getVal() {
        return val;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "{\"val\": " + val + ", \"descripcion\": \"" + descripcion + "\"}";
    }
}
