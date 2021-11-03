package com.clothapp.demo.dto;

import com.clothapp.demo.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductDtoConverter {

    public ProductDto convert(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setAmountSize(product.getAmountSize());
        productDto.setColorCode(product.getColor().getColorCode());
        productDto.setTypeName(product.getProductType().getTypeName());
        return productDto;
    }

}
