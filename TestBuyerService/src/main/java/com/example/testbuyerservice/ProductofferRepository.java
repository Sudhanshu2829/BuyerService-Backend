package com.example.testbuyerservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductofferRepository extends JpaRepository<Productoffer, String> {
    @Query(value = "SELECT * FROM productoffers",nativeQuery = true)
    List<Productoffer> findallProductDetails();

    @Query(value = "SELECT * FROM productoffers p WHERE p.hscode=?",nativeQuery = true)
    List<Productoffer> findProduct(String hscode);
}