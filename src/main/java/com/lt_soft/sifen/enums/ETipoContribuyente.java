package com.lt_soft.sifen.enums;

import java.util.Arrays;

public enum ETipoContribuyente {
    PERSONA_FISICA((short) 1, "Persona Física"),
    PERSONA_JURIDICA((short) 2, "Persona Jurídica");

    private short val;
    private String descripcion;

    ETipoContribuyente(short val, String descripcion) {
        this.val = val;
        this.descripcion = descripcion;
    }

    public static ETipoContribuyente getByVal(short val) {
        return Arrays.stream(ETipoContribuyente.values()).filter(e -> e.val == val).findFirst().orElse(null);
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
