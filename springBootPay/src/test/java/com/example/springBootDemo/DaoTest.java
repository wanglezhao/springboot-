//package com.example.springBootDemo;
//
//import org.junit.Ignore;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.guweibit.SpringBootDemoApplication;
//import com.guweibit.springBootDemo.dao.UserMapper;
//import com.guweibit.springBootDemo.entity.Commodity;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes=SpringBootDemoApplication.class)
//public class DaoTest {
//	@Autowired
//    private UserMapper userDao;
//	
//	/**
//     * 	通过商品名查找商品信息
//     */
//    @Test
//    @Ignore
//    public void testGetUserById() {
//        Commodity user = this.userDao.getCommodityInformationByName("旺仔牛奶");
//        System.out.println(user.getPrice());
//    }
//}
