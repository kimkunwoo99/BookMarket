package kr.ac.kopo.konumon.bookmarket.repository;

import kr.ac.kopo.konumon.bookmarket.domain.Order;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
    private Map<Long, Order> listOfOrders;
    private long nextOrderId;


    public OrderRepositoryImpl() {
        listOfOrders = new HashMap<>();
        nextOrderId = 2000;
    }

    private synchronized long getNextOrderId() {
        return nextOrderId++;
    }

    @Override
    public Long save(Order order) {
        order.setOrderId(nextOrderId);
        listOfOrders.put(order.getOrderId(), order);
        return order.getOrderId();
    }
}
