package com.clothapp.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
public class ProductType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer typeId;

    @Column
    private String typeName;
    @OneToMany(mappedBy = "productType", fetch = FetchType.LAZY)
    private List<Product> Products;

    public ProductType() {
    }

    public ProductType(Integer typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    public ProductType(String typeName) {
        this.typeName = typeName;
    }
}
