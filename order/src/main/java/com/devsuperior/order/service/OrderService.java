package com.devsuperior.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.order.entities.Order;

@Service
public class OrderService {

	@Autowired
	ShippingService shippingService;
	
	public double total(Order order) {
		
		double discountPrice = order.getBasic() * order.getDiscount() / 100;
		
		return order.getBasic() - discountPrice + shippingService.shipment(order);
	}
}
