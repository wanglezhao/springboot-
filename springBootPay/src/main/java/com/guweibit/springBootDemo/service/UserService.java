package com.guweibit.springBootDemo.service;

import java.util.List;

import com.guweibit.springBootDemo.entity.AlipayOrderInformation;
import com.guweibit.springBootDemo.entity.Commodity;
import com.guweibit.springBootDemo.entity.User;

public interface UserService {
	//测试查询数据
	List<User> getUser();
	
	/**
	 * 	通过商品名称得到商品信息
	 * @param name
	 * @return 商品信息
	 */
	Commodity getCommodityInformationByName(String name);
	
	/**
	 * 	根据商品单价和数量计算应支付的金额
	 * @param price单价 number数量
	 * @return	支付信息
	 */
	AlipayOrderInformation getTotalAmount(Integer price,Integer number);
}
