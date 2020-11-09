package com.dimitriskaitantzidis.crud.example.repository;

import com.dimitriskaitantzidis.crud.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> { // <Model name, data type of Primary Key>


    Product findByName(String name);

}
