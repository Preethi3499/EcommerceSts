package com.edubridge.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.Order;

@Repository
public interface OrderDao extends JpaRepository<Order, Long> {

}
