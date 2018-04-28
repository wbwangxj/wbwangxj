package com.wangxj.adapter.test;

import com.wangxj.adapter.Mobile;
import com.wangxj.adapter.Voltage200;
import com.wangxj.adapter.objectadapter.VoltageAdapter;

public class ObjectAdapterTest {
	public static void main(String[] args) {
		System.out.println("=============对象适配器==============");
		VoltageAdapter voltageAdapter = new VoltageAdapter(new Voltage200());
		Mobile mobile = new Mobile();
		mobile.charging(voltageAdapter);
	}
}
