package kr.ac.kopo.konumon.bookmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import kr.ac.kopo.konumon.bookmarket.domain.*;

public interface OrderProRepository extends JpaRepository<Order, Long> {

}