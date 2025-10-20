package com.lt_soft.sifen.services;

import com.lt_soft.sifen.models.Emisor;
import com.lt_soft.sifen.utils.LtsUtils;
import com.roshka.sifen.Sifen;
import com.roshka.sifen.core.SifenConfig;
import com.roshka.sifen.core.beans.response.RespuestaConsultaRUC;
import com.roshka.sifen.internal.util.SifenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class ConsultarRucService {
    private static final Logger logger = Logger.getLogger(ConsultarRucService.class.toString());
    private final EmisorService emisorService;

    @Autowired
    public ConsultarRucService(EmisorService emisorService) {
        this.emisorService = emisorService;
    }

    public String consultarRucSifen(Long idEmisor, String ruc) {
        try {
            String rucSinDV = ruc.split("-")[0];
            Emisor emisor = emisorService.getById(idEmisor);
            SifenConfig config = LtsUtils.buildConfig(emisor);
            Sifen.setSifenConfig(config);
            RespuestaConsultaRUC respuesta = Sifen.consultaRUC(rucSinDV);
            return respuesta.getdMsgRes();
        } catch (Exception e) {
            logger.info(e.getMessage());
            return e.getMessage();
        }
    }
}
