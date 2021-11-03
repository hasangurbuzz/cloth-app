package com.clothapp.demo.controller;

import com.clothapp.demo.dto.ColorDto;
import com.clothapp.demo.service.ColorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/color")
public class ColorController {

    private final ColorService colorService;

    public ColorController(ColorService colorService) {
        this.colorService = colorService;
    }

    @GetMapping
    public ColorDto getAllColors() {
        return colorService.getAllColors();
    }

    @PostMapping
    public String addColor(@RequestParam String colorName) {

        return colorService.saveColorIfNotExists(colorName);
    }
}
