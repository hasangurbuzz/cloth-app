package com.clothapp.demo.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class ProductRequest {


    private Integer amountSize;
    private String colorCode;
    private String typeName;

}
