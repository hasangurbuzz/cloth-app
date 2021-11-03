package com.clothapp.demo.controller;


import com.clothapp.demo.dto.TypeDto;
import com.clothapp.demo.service.TypeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/type")
public class TypeController {

    private final TypeService typeService;

    public TypeController(TypeService typeService) {
        this.typeService = typeService;
    }


    @GetMapping
    public TypeDto getAllTypes() {
        return typeService.getAllTypes();

    }


    @PostMapping
    public String addColor(@RequestParam String type) {
        return typeService.saveType(type);
    }

}
