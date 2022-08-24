package com.edubridge.service;


import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.edubridge.OrderProduct;


@Validated
public interface OrderProductService {
  OrderProduct create(@NotNull(message = "The products for order cannot be null.") @Valid OrderProduct orderProduct);
} 

