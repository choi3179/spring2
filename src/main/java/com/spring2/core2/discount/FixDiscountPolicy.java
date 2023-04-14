package com.spring2.core2.discount;

import com.spring2.core2.member.Grade;
import com.spring2.core2.member.Member;

// 정액 할인 정책 구현체
public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000;   // 1000원 할인
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return discountFixAmount;
        }
        return 0;
    }
}
