package com.custom.genertor.jpa.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.custom.genertor.jpa.entities.OrderDetails;

public interface OrderDetailsReposetory extends JpaRepository<OrderDetails, Serializable> {

}
