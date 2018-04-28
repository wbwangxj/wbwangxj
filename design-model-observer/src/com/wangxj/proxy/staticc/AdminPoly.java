package com.wangxj.proxy.staticc;

/**
 * 以聚合方式实现代理主题，代理类
 * @author wbwangxj
 *
 */
public class AdminPoly implements Manager {
	
	private Admin admin;
	
	public AdminPoly(Admin admin) {
		super();
		this.admin = admin;
	}



	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("LOG:admin操作开始");
		admin.doSomething();
		System.out.println("LOG：admin操作结束");
	}

}
