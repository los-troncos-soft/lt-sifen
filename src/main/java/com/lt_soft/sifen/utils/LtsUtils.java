package com.lt_soft.sifen.utils;

import com.lt_soft.sifen.enums.EAmbiente;
import com.lt_soft.sifen.models.Emisor;
import com.roshka.sifen.core.SifenConfig;
import com.roshka.sifen.internal.ctx.GenerationCtx;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

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

    public static GenerationCtx buildContext(Emisor emisor) {
        // Sifen Context
        return GenerationCtx.getDefaultFromConfig(LtsUtils.buildConfig(emisor));
    }

    public static LocalDateTime date2LocalDateTime(Date fecha){
        Instant instant = fecha.toInstant();
        return instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    public static LocalDate date2LocalDate(Date fecha){
        Instant instant = fecha.toInstant();
        return instant.atZone(ZoneId.systemDefault()).toLocalDate();
    }
}
