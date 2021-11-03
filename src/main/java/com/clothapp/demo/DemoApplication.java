package com.clothapp.demo;

import com.clothapp.demo.model.Color;
import com.clothapp.demo.model.Product;
import com.clothapp.demo.model.ProductType;
import com.clothapp.demo.repository.ColorRepository;
import com.clothapp.demo.repository.ProductRepository;
import com.clothapp.demo.repository.TypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class DemoApplication implements CommandLineRunner {


    private final ProductRepository productRepository;
    private final ColorRepository colorRepository;
    private final TypeRepository typeRepository;

    public DemoApplication(ProductRepository productRepository, ColorRepository colorRepository, TypeRepository typeRepository) {
        this.productRepository = productRepository;
        this.colorRepository = colorRepository;
        this.typeRepository = typeRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

        colorRepository.save(
                new Color("1234")
        );
        System.out.println("Color saved");
        typeRepository.save(
                new ProductType("İpek")
        );
        System.out.println("Type saved");
//        productRepository.save(
//                Product.builder()
//                        .color(new Color("1234"))
//                        .amountSize(1234)
//                        .productType(new ProductType("İpek"))
//                        .build()
//        );
//        System.out.println("Product saved");


    }
}
