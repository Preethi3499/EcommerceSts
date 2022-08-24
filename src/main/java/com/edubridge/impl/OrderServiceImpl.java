package com.edubridge.impl;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edubridge.Order;
import com.edubridge.dao.OrderDao;
import com.edubridge.service.OrderService;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
	
	private OrderDao orderDao;
	public OrderServiceImpl(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	public @NotNull Iterable<Order> getAllOrders() {
		return this.orderDao.findAll();
	}

	@Override
	public Order create(@NotNull(message = "The order cannot be null.") @Valid Order order) {
		return this.orderDao.save(order);
	}

	@Override
	public void update(@NotNull(message = "The order cannot be null.") @Valid Order order) {
		this.orderDao.save(order);
		
	}

}