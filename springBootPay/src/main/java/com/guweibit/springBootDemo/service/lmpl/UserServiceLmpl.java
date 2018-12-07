package com.guweibit.springBootDemo.service.lmpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guweibit.springBootDemo.dao.UserMapper;
import com.guweibit.springBootDemo.entity.AlipayOrderInformation;
import com.guweibit.springBootDemo.entity.Commodity;
import com.guweibit.springBootDemo.entity.User;
import com.guweibit.springBootDemo.service.UserService;
@Service
public class UserServiceLmpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> getUser() {
		
		return userMapper.getUser();
	}
	/**
	 * 	通过商品名称得到商品信息
	 * @param name
	 * @return 商品信息
	 */
	public Commodity getCommodityInformationByName(String name) {
		// TODO Auto-generated method stub
		return userMapper.getCommodityInformationByName(name);
	}
	/**
	 * 	根据商品单价和数量计算应支付的金额
	 * @param price单价 number数量
	 * @return	应支付金额
	 */
	public AlipayOrderInformation getTotalAmount(Integer price, Integer number) {
		AlipayOrderInformation payInfo = null;
		//设置支付金额
		Integer TotalAmount=price*number;
		payInfo.setTotalAmount(TotalAmount);
		//支付订单号
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		payInfo.setOutTradeNo(Integer.valueOf(df.format(new Date())));
		return payInfo;
	}
	
	
}
