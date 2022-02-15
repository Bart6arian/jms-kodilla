package com.klodilla.kodillajms.repository;

import com.klodilla.kodillajms.domain.SimpleOrder;
import com.klodilla.kodillajms.domain.SimpleOrderDto;

//no implementation of crud repository, only for precise

public interface OrderRepository {
    SimpleOrder addNew(SimpleOrder order);
    void delete(int id);
    SimpleOrder findById(int id);
}
