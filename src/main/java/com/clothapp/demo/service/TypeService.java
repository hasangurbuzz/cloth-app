package com.clothapp.demo.service;

import com.clothapp.demo.dto.TypeDto;
import com.clothapp.demo.model.ProductType;
import com.clothapp.demo.repository.TypeRepository;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class TypeService {

    private final TypeRepository typeRepository;

    public TypeService(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    public TypeDto getAllTypes() {
        TypeDto typeDto = new TypeDto();

        typeDto.setTypeList(
                typeRepository.findAll()
                        .stream()
                        .map(ProductType::getTypeName)
                        .collect(Collectors.toList()));
        typeDto.setCountOfProducts(typeDto.getTypeList().size());
        return typeDto;
    }

    public String saveType(String typeName) {
        typeRepository.save(new ProductType(typeName));
        return typeName + " saved";
    }

    public ProductType getTypeByTypeName(String typeName) {

        return typeRepository.findProductTypeByTypeName(typeName);


    }
}
