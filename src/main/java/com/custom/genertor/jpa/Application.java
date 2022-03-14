package com.custom.genertor.jpa;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.custom.genertor.jpa.entities.OrderDetails;
import com.custom.genertor.jpa.repository.OrderDetailsReposetory;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		OrderDetailsReposetory bean = context.getBean(OrderDetailsReposetory.class);
		
		OrderDetails order = new OrderDetails();
		order.setOrderName("Watch");
		order.setOrderBy("keshav");
		order.setOrderDate(new Date());
		
		OrderDetails details = bean.save(order);
		System.out.println(details);
	}

}
