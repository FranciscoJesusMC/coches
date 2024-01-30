package com.proyecto.coches.mapper;

import com.proyecto.coches.dto.MarcaDTO;
import com.proyecto.coches.entity.Marca;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MarcaMapper {

    Marca toMarcaDTO(Marca marca);
    MarcaDTO toMarca(MarcaDTO marcaDTO);
}
