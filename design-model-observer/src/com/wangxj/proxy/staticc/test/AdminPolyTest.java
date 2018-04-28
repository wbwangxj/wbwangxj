package com.wangxj.proxy.staticc.test;

import com.wangxj.proxy.staticc.Admin;
import com.wangxj.proxy.staticc.AdminPoly;
import com.wangxj.proxy.staticc.Manager;

public class AdminPolyTest {
	public static void main(String[] args) {
		Admin admin = new Admin();
		Manager m = new AdminPoly(admin);
		m.doSomething();
	}
}
