package com.wangxj.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;

/**
 * jdk动态代理
 * 事务处理器
 * @author wbwangxj
 *
 */
public class TimeHandler implements InvocationHandler {
	
	private Object target;
	
	
	
	public TimeHandler(Object target) {
		super();
		this.target = target;
	}


	/**
	 * proxy:被代理对象
	 * method：被代理对象的方法
	 * args 方法的参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶。。。");
		SimpleDateFormat sf = new SimpleDateFormat("HH:mm:ss SSS");
		System.out.println(sf.format(startTime));
		method.invoke(target, args);
		long stopTime = System.currentTimeMillis();
		System.out.println(sf.format(stopTime));
		System.out.println("汽车结束行驶。。。到汽车行驶时间："+(stopTime-startTime)+"毫秒！");
		return null;
	}

}
