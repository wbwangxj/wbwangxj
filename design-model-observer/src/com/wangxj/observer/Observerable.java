package com.wangxj.observer;

/**
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 * @author wbwangxj
 *
 */
public interface Observerable {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	/**
	 * 当被观察者(WechatServer)调用notifyObserver()方法时，观察者的update()方法会被回调
	 */
	public void notifyObserver();
}
