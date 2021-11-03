package com.clothapp.demo.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@Builder
@Entity
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer amountSize;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "colorCode")
    private Color color;


    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "typeName")
    private ProductType productType;


    public Product(Integer id, Integer amountSize, Color color, ProductType productType) {
        this.id = id;
        this.amountSize = amountSize;
        this.color = color;
        this.productType = productType;
    }

    public Product() {
    }
}

