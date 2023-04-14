package com.spring2.core;

import com.spring2.core.discount.DiscountPolicy;
import com.spring2.core.discount.FixDiscountPolicy;
import com.spring2.core.discount.RateDiscountPolicy;
import com.spring2.core.member.MemberRepository;
import com.spring2.core.member.MemberService;
import com.spring2.core.member.MemberServiceImpl;
import com.spring2.core.member.MemoryMemberRepository;
import com.spring2.core.order.OrderService;
import com.spring2.core.order.OrderServiceImpl;
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
