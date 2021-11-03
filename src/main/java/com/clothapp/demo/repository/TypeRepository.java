package com.clothapp.demo.repository;

import com.clothapp.demo.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TypeRepository extends JpaRepository<ProductType, Integer> {

    Optional<ProductType> findProductTypeByTypeName(String typeName);

}
