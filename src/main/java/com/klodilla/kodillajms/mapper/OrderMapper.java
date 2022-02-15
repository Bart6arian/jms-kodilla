package com.klodilla.kodillajms.mapper;

import com.klodilla.kodillajms.domain.SimpleOrder;
import com.klodilla.kodillajms.domain.SimpleOrderDto;
import org.springframework.stereotype.Service;

@Service
public class OrderMapper {

    public SimpleOrder mapToSimpleOrder(final SimpleOrderDto dto) {
        return new SimpleOrder(
                dto.getValue(),
                dto.getId());
    }

    public SimpleOrderDto mapToOrderDto(final SimpleOrder order) {
        return new SimpleOrderDto(
                order.getValue(),
                order.getId());
    }
}
