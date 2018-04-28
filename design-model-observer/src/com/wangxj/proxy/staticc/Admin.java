package com.wangxj.proxy.staticc;

/**
 * 真实主题类，被代理类
 * @author wbwangxj
 *
 */
public class Admin implements Manager {
	
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("Admin do something");
	}

}
