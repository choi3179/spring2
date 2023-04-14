package com.spring2.core2.order;

//  주문 서비스 인터페이스
public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);

}
