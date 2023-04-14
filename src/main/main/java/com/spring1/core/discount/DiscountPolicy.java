package com.spring1.core.discount;

import com.spring1.core.member.Member;

//  할인 정책 인터페이스
public interface DiscountPolicy {

    /**
     @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
