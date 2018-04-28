package com.wangxj.observer;

/**
 * 抽象观察者
 * 定义一个update()方法，当被观察者(WechatServer)调用notifyObserver()方法时，观察者的update()方法会被回调
 * @author wbwangxj
 *
 */
public interface Observer {
	
	public void update(String message);
}
