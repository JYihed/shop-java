package com.example.shop.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    public Integer id;
    public String name;
    public String imag1;
    public String imag2;
    public String imag3;
    public float price;
    public Integer inventory;
}
