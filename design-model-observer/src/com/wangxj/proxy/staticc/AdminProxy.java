package com.wangxj.proxy.staticc;

/**
 * 继承式静态代理，Admin真实主题类
 * @author wbwangxj
 *
 */
public class AdminProxy extends Admin {
	
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("log:admin开始操作");
		super.doSomething();
		System.out.println("log:admin操作结束");
	}
}
