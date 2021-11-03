package com.clothapp.demo.repository;

import com.clothapp.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collections;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {


}
