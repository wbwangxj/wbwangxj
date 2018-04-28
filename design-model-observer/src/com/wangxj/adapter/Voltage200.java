package com.wangxj.adapter;

/**
 * source类：220v电压
 * 类适配器
 * @author wbwangxj
 *
 */
public class Voltage200 {
	public int output220V() {
		int src = 220;
		System.out.println("我是"+src+"V");
		return src;
	}
}
