package com.guweibit.springBootDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guweibit.springBootDemo.dao.UserMapper;
import com.guweibit.springBootDemo.entity.Commodity;



@Controller
public class JSPControlle {
	UserMapper userMapper;
	
	@RequestMapping("/pay")
	public String pay() {
		Commodity com=userMapper.getCommodityInformationByName("旺仔牛奶");
		System.out.println(com.getPrice());
		
		return "index";
	}
	
	@RequestMapping("/alipayTradePagePay")
	public String alipayTradePagePay() {
		return "alipayTradePagePay";
	}
	
	@RequestMapping("/alipayTradeClose")
	public String alipayTradeClose() {
		return "alipayTradeClose";
	}
	
	@RequestMapping("/alipayTradeFastpayRefundQuery")
	public String alipayTradeFastpayRefundQuery() {
		return "alipayTradeFastpayRefundQuery";
	}
	
	@RequestMapping("/alipayTradeQuery")
	public String alipayTradeQuery() {
		return "alipayTradeQuery";
	}
	
	@RequestMapping("/alipayTradeRefund")
	public String alipayTradeRefund() {
		return "alipayTradeRefund";
	}
	
	@RequestMapping("/returnUrl")
	public String returnUrl() {
		return "returnUrl";
	}
	
	@RequestMapping("/notifyUrl")
	public String notifyUrl() {
		return "notifyUrl";
	}
}
