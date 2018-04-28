package com.wangxj.proxy.dynamic.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.wangxj.proxy.dynamic.Car;
import com.wangxj.proxy.dynamic.Moveable;
import com.wangxj.proxy.dynamic.TimeHandler;

/**
 * JDK动态代理步骤

	1.       创建一个实现InvocationHandler接口的类，它必须实现invoke()方法

	2.       创建被代理的类及接口

	3.       调用Proxy的静态方法，创建一个代理类

	4.       通过代理调用方法
 * @author wbwangxj
 *
 */
public class TimeHandlerTest {
	public static void main(String[] args) throws Exception {
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Class<?> clz = car.getClass();
		/**
		 * loader--类加载器（进行代理的类）
		 * interfaces--被代理类实现的接口
		 * InvocationHandler--事务处理器
		 */
		Moveable m = (Moveable) Proxy.newProxyInstance(clz.getClassLoader(), clz.getInterfaces(), h);
		m.move();
		
	}
}
