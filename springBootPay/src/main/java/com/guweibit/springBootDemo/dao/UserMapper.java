package com.guweibit.springBootDemo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.guweibit.springBootDemo.entity.Commodity;
import com.guweibit.springBootDemo.entity.User;

@Mapper
public interface UserMapper {
	//sql查询 1
	@Select("SELECT * FROM hello")
    List<User> getUser();

	//sql查询  2
	/*@Select("SELECT * FROM USER WHERE AGE=#{age}")
    public List<User> getUser(int age);*/
	/**
	 * 	通过商品名称得到商品信息
	 * @param name
	 * @return 商品信息
	 */
//	@Query(value = "select * from commodity_list where name=#{name}", nativeQuery = true)
//    @Modifying
	Commodity getCommodityInformationByName(String name);
}
