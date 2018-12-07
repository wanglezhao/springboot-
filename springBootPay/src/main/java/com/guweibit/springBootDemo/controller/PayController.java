package com.guweibit.springBootDemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guweibit.config.AlipayConfig;
import com.guweibit.springBootDemo.entity.AlipayOrderInformation;
import com.guweibit.springBootDemo.entity.Commodity;
import com.guweibit.springBootDemo.service.lmpl.UserServiceLmpl;

@Controller
public class PayController {
	AlipayConfig alipayConfig;
	UserServiceLmpl userServiceLmpl;
	
	@RequestMapping("/paytest")
	public String pay(HttpServletRequest request,String name,Integer number) {
//		AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl,AlipayConfig.app_id,AlipayConfig.merchant_private_key, "json",AlipayConfig.charset,AlipayConfig.alipay_public_key, "RSA2"); 
//		AlipayTradePrecreateRequest request = new AlipayTradePrecreateRequest();
//		AlipayTradePrecreateModel model = new AlipayTradePrecreateModel();
//		request.setBizModel(model);
//		model.setOutTradeNo(request.getProdCode());;
//		model.setTotalAmount("88.88");
//		model.setSubject("Iphone6 16G");
//		AlipayTradePrecreateResponse response = alipayClient.execute(request);
//		System.out.print(response.getBody());
//		System.out.print(response.getQrCode());
		Commodity com=userServiceLmpl.getCommodityInformationByName(name);
		Integer price=com.getPrice();
		AlipayOrderInformation payinfo=userServiceLmpl.getTotalAmount(price, number);
		request.setAttribute("WIDout_trade_no", payinfo.getOutTradeNo());
		request.setAttribute("WIDtotal_amount", payinfo.getTotalAmount());
		request.setAttribute("WIDsubject", "这是个商品");
		request.setAttribute("WIDbody", "嗯！这确实是个商品");
		return "alipayTradePagePay";
	}
	
	
}
