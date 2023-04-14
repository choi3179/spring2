package com.spring2.core2;

import com.spring2.core2.member.Grade;
import com.spring2.core2.member.Member;
import com.spring2.core2.member.MemberService;
import com.spring2.core2.member.MemberServiceImpl;
import com.spring2.core2.order.Order;
import com.spring2.core2.order.OrderService;
import com.spring2.core2.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 20000);

        System.out.println("order = " + order);

    }
}
