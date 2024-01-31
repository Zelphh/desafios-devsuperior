package com.devsuperior.order.service;

import org.springframework.stereotype.Service;

import com.devsuperior.order.entities.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {
		if (order.getBasic() < 100) {
			return 20.0;
		} else if (order.getBasic() >= 200) {
			return 0.0;
		} else {
			return 12.0;
		}
	}
}
