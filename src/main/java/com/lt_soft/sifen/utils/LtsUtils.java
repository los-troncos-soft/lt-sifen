package com.lt_soft.sifen.utils;

import com.lt_soft.sifen.enums.EAmbiente;
import com.lt_soft.sifen.models.Emisor;
import com.roshka.sifen.core.SifenConfig;

public class LtsUtils {
    public static SifenConfig buildConfig(Emisor emisor) {
        SifenConfig c = new SifenConfig(SifenConfig.TipoAmbiente.DEV,
                emisor.getIdCsc1(), emisor.getCsc1(), SifenConfig.TipoCertificadoCliente.PFX,
                emisor.getPathCertificado(), emisor.getPasswordCertificado());
        if (EAmbiente.getByVal(emisor.getAmbiente()) == EAmbiente.PRODUCCION)
            c.setAmbiente(SifenConfig.TipoAmbiente.PROD);
        c.setHabilitarNotaTecnica13(true);
        return c;
    }
}
