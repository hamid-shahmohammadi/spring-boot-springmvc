package com.iranlaravel.springmvc.springmvc.repository;

import com.iranlaravel.springmvc.springmvc.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,String> {
}
