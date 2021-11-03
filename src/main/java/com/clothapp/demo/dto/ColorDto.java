package com.clothapp.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ColorDto {
    private List<String> colorNames;
    private Integer countOfColors = 0;

    public void setColorNames(List<String> colorNames) {
        this.colorNames = colorNames;
        this.countOfColors = colorNames.size();
    }

}
