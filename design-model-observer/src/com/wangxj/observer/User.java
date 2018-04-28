package com.wangxj.observer;

/**
 * 观察者
 * @author wbwangxj
 *
 */
public class User implements Observer {
	
	private String name;
	
	private String message;
	
	
	
	public User(String name) {
		super();
		this.name = name;
	}

	public void read() {
		System.out.println(name + " 收到推送消息： " + message);
	}

	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		this.message = message;
		read();
	}

}
