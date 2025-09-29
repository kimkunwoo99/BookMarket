package kr.ac.kopo.konumon.bookmarket.repository;

import kr.ac.kopo.konumon.bookmarket.domain.Order;

public interface OrderRepository {
//  주문목록 저장
    Long save(Order order);
}
