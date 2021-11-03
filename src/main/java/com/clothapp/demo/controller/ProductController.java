package com.clothapp.demo.controller;

import com.clothapp.demo.dto.ProductDto;
import com.clothapp.demo.dto.ProductRequest;
import com.clothapp.demo.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")

public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //GetMapping
    @GetMapping()
    public List<ProductDto> getAllProducts() {
        return productService.getAllProducts();
    }


    //PostMapping
    @PostMapping
    public void addProduct(@RequestBody ProductRequest productRequest) {
        productService.saveProduct(
                productRequest

        );
    }


}
