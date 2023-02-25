package org.example.seminar3.hw.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Products2 {
    private String name;
    private String country;
    private Double weight;
    private Integer price;
    private Integer sort;
}
