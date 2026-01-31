package com.greenchain.dpp_engine.repository;

import com.greenchain.dpp_engine.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // This empty interface gives us:
    // .save(), .findById(), .findAll(), .delete(), etc.
    // automatically!
}