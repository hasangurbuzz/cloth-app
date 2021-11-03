package com.clothapp.demo.service;

import com.clothapp.demo.dto.ProductDto;
import com.clothapp.demo.dto.ProductDtoConverter;
import com.clothapp.demo.dto.ProductRequest;
import com.clothapp.demo.model.Product;
import com.clothapp.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductDtoConverter productDtoConverter;
    private final ColorService colorService;
    private final TypeService typeService;

    public ProductService(ProductRepository productRepository,
                          ProductDtoConverter productDtoConverter, ColorService colorService, TypeService typeService) {
        this.productRepository = productRepository;
        this.productDtoConverter = productDtoConverter;
        this.colorService = colorService;
        this.typeService = typeService;
    }


    public List<ProductDto> getAllProducts() {
        List<Product> productList = productRepository.findAll();
        List<ProductDto> productDtoList = new ArrayList<>();

        for (Product product : productList) {
            productDtoList.add(productDtoConverter.convert(product));
        }
        return productDtoList;

    }


    public void saveProduct(ProductRequest productRequest) {

        //The problem is getting data from db

        var color =
                colorService.getColorByColorCode(productRequest.getColorCode());

        var type =
                typeService.getTypeByTypeName(productRequest.getTypeName());

        var product = new Product();
        color.getProducts().add(product);
        type.getProducts().add(product);
        product.setAmountSize(10);
        product.setProductType(type);
        product.setColor(color);

        productRepository.save(product);

//
//        productRepository.save(
//                Product.builder()
//                        .productType(type)
//                        .color(color)
//                        .amountSize(productRequest.getAmountSize())
//                        .build()
//        );
    }
}
