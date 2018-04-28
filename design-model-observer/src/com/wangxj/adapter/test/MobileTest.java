package com.wangxj.adapter.test;

import com.wangxj.adapter.Mobile;
import com.wangxj.adapter.VoltageAdapter;

public class MobileTest {
	public static void main(String[] args)
	 {
		System.out.println("=============类适配器==========");
		Mobile mobile = new Mobile();
		mobile.charging(new VoltageAdapter());
	}
}
