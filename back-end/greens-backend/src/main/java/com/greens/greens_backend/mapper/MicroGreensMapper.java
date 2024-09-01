package com.greens.greens_backend.mapper;

import com.greens.greens_backend.dto.MicroGreensDto;
import com.greens.greens_backend.entity.MicroGreens;

public class MicroGreensMapper {

    public static MicroGreensDto mapMicroGreensToMicroGreensDto(MicroGreens microGreens) {
        return new MicroGreensDto(
                microGreens.getId(),
                microGreens.getItemName(),
                microGreens.getPrice(),
                microGreens.getDescription(),
                microGreens.getWeight(),
                microGreens.getUom(),
                microGreens.getCategory(),
                microGreens.getPromotionFlag(),
                microGreens.getNewPrice()
        );
    }

    public static MicroGreens mapMicroGreensDtoToMicroGreens(MicroGreensDto microGreensDto) {
        return new MicroGreens(
                microGreensDto.getId(),
                microGreensDto.getItemName(),
                microGreensDto.getPrice(),
                microGreensDto.getDescription(),
                microGreensDto.getWeight(),
                microGreensDto.getUom(),
                microGreensDto.getCategory(),
                microGreensDto.getPromotionFlag(),
                microGreensDto.getNewPrice()
        );
    }

}
