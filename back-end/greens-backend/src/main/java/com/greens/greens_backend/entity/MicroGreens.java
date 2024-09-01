package com.greens.greens_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Micro_Greens")
public class MicroGreens {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Item_name", nullable = false)
    private String itemName;

    @Column(name = "Price")
    private float price;

    @Column(name = "Description")
    private String description;

    @Column(name = "Weight")
    private float weight;

    @Column(name = "UOM")
    private String uom;

    @Column(name = "Category")
    private String category;

    @Column(name = "Promotion_flag")
    private Boolean promotionFlag;

    @Column(name = "New_price")
    private float newPrice;

}
