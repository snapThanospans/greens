package com.greens.greens_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MicroGreensDto {
    private Long id;
    private String ItemName;
    private float price;
    private String description;
    private float weight;
    private String uom;
    private String category;
    private Boolean promotionFlag;
    private float newPrice;

}
