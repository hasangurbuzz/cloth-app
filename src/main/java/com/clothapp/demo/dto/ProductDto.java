package com.clothapp.demo.dto;

import lombok.*;

import java.io.Serializable;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ProductDto implements Serializable {
    private Integer amountSize;
    private String colorCode;
    private String typeName;


}
