package com.clothapp.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Getter
@Setter
@Entity

public class Color implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer colorId;

    @Column
    private String colorCode;


    @OneToMany(mappedBy = "color", fetch = FetchType.LAZY)
    private List<Product> Products;


    public Color(String colorCode) {
        this.colorCode = colorCode;
    }

    public Color() {
    }

    public Color(Integer colorId, String colorCode) {
        this.colorId = colorId;
        this.colorCode = colorCode;
    }
}
