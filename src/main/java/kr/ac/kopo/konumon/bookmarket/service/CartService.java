package kr.ac.kopo.konumon.bookmarket.service;

import kr.ac.kopo.konumon.bookmarket.domain.Cart;

public interface CartService {
    Cart create(Cart cart);
    Cart read(String cartId);
    void update(String cartId, Cart cart);
    void delete(String cartId);
}