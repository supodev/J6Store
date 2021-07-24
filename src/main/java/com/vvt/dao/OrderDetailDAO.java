package com.vvt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vvt.entity.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long>{

}
