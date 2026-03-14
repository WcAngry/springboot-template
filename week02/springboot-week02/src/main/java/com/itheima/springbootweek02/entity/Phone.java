package com.itheima.springbootweek02.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Phone {
    private String brand;
    private Double price;
    private String color;
}
