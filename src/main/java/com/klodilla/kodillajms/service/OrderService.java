package com.klodilla.kodillajms.service;

import com.klodilla.kodillajms.domain.SimpleOrder;
import com.klodilla.kodillajms.domain.SimpleOrderDto;
import com.klodilla.kodillajms.mapper.OrderMapper;
import com.klodilla.kodillajms.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private OrderRepository repository;
    private OrderMapper mapper;

    public SimpleOrder addNewOrder(final SimpleOrderDto orderDto) {
        return repository.addNew(mapper.mapToSimpleOrder(orderDto));
    }

    public void deleteOrderById(final SimpleOrderDto dto) {
        repository.delete(mapper.mapToSimpleOrder(dto).getId());
    }

    public SimpleOrder findById(final int id) {
        return repository.findById(id);
    }
}
