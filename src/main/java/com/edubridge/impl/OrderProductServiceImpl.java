package com.edubridge.impl;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.edubridge.OrderProduct;
import com.edubridge.dao.OrderProductDao;
import com.edubridge.service.OrderProductService;

@Transactional
@Component
public class OrderProductServiceImpl implements OrderProductService {
	
	@Autowired
	private OrderProductDao orderProductDao;

	@Override
	public OrderProduct create(
			@NotNull(message = "The products for order cannot be null.") @Valid OrderProduct orderProduct) {
		return this.orderProductDao.save(orderProduct);
	}
}
