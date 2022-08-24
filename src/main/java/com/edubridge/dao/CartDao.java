package com.edubridge.dao;



import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.edubridge.Cart;
@Component
@Repository
public interface CartDao extends JpaRepository<Cart, Long>{
   Optional<Cart> findByName(String name);
}
