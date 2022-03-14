package com.custom.genertor.jpa.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "order_details")
@Data
public class OrderDetails {
	
	@Id
	@GenericGenerator(
			name = "order_id_gen" ,
			strategy = "com.custom.genertor.jpa.custom.generator.OrderDetailsGenerator"
			)
	@GeneratedValue(generator = "order_id_gen")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String orderId ;
	private String orderBy ;
	private String orderName ;
	@Temporal(TemporalType.DATE)
	private Date orderDate ;

}
