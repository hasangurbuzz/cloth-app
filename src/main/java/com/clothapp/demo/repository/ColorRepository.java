package com.clothapp.demo.repository;

import com.clothapp.demo.model.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository<Color, Integer> {

    Color findColorByColorCode(String colorCode);


}
