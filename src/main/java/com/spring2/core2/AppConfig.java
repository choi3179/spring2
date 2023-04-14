package com.spring2.core2;

import com.spring2.core2.discount.DiscountPolicy;
import com.spring2.core2.discount.FixDiscountPolicy;
import com.spring2.core2.discount.RateDiscountPolicy;
import com.spring2.core2.member.MemberRepository;
import com.spring2.core2.member.MemberService;
import com.spring2.core2.member.MemberServiceImpl;
import com.spring2.core2.member.MemoryMemberRepository;
import com.spring2.core2.order.OrderService;
import com.spring2.core2.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        //return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
