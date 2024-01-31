package com.devsuperior.order;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.order.entities.Order;
import com.devsuperior.order.service.OrderService;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner{
	
	@Autowired
	OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Código do pedido: ");
		int code = sc.nextInt();
		
		System.out.print("Valor básico: ");
		double basic = sc.nextDouble();
		
		System.out.print("Porcentagem de desconto: ");
		double discount = sc.nextDouble();
		
		Order order = new Order(code, basic, discount);
		
		System.out.println("Pedido código: " + order.getCode());
		System.out.printf("Valor total: R$ %.2f", orderService.total(order));
		
		sc.close();
		
	}

}
