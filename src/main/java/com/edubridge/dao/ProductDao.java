package com.edubridge.dao;



import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.edubridge.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Long>{
    @Query("SELECT p FROM Product p WHERE p.name LIKE :n")
    List<Product> findByName(@Param("n") String name);
    
}
