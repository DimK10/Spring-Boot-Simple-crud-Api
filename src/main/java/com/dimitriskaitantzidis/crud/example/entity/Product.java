package com.dimitriskaitantzidis.crud.example.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int quantity;

    private double price;
}
