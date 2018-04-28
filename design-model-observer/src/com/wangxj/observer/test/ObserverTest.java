package com.wangxj.observer.test;


import com.wangxj.observer.Observer;
import com.wangxj.observer.User;
import com.wangxj.observer.WechatServer;

public class ObserverTest {
	public static void main(String[] args) throws InterruptedException {
		WechatServer server = new WechatServer();
		Observer userZhang = new User("张三");
		Observer userLi = new User("李四");
		Observer userWang = new User("王五");
		
		server.registerObserver(userZhang);
		server.registerObserver(userLi);
		server.registerObserver(userWang);
		server.setInformation("java是世界上最好用的语言！");
		
		System.out.println("--------------------------------------");
		Thread.sleep(5000);
		server.removeObserver(userZhang);
		server.setInformation("javaScript是世界最好用的语言！");
				
	}
}
