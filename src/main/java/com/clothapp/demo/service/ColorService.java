package com.clothapp.demo.service;

import com.clothapp.demo.dto.ColorDto;
import com.clothapp.demo.model.Color;
import com.clothapp.demo.repository.ColorRepository;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class ColorService {

    private final ColorRepository colorRepository;


    public ColorService(ColorRepository colorRepository) {
        this.colorRepository = colorRepository;
    }


    public ColorDto getAllColors() {

        var colorDto = new ColorDto();
        colorDto.setColorNames(
                colorRepository.findAll()
                        .stream()
                        .map(Color::getColorCode)
                        .collect(Collectors.toList()));

        return colorDto;

    }

    public String saveColorIfNotExists(String colorCode) {
        colorRepository.save(
                new Color(colorCode)
        );
        return "Saved";

//
//        if (colorRepository.findColorByColorCode(colorCode).isEmpty()) {
//            colorRepository.save(new Color(colorCode));
//            System.out.println("color saveddd");
//            return colorCode + " saved";
//        } else {
//            System.out.println("color alreadyy saveddd");
//            return colorCode + " already saved";
//        }

    }

    public Color getColorByColorCode(String colorCode) {
        return colorRepository.findColorByColorCode(colorCode);

    }
}
