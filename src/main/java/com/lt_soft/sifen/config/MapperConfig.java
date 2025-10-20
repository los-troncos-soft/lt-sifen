package com.lt_soft.sifen.config;

import com.lt_soft.sifen.dtos.EmisorDto;
import com.lt_soft.sifen.models.Emisor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        // 💡 Usa coincidencia estricta (no por prefijos)
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT)
                .setSkipNullEnabled(true);

        // 💡 Ignora el id en la entidad destino
        modelMapper.typeMap(EmisorDto.class, Emisor.class)
                .addMappings(mapper -> mapper.skip(Emisor::setId));

        return modelMapper;
    }
}