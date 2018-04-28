package com.wangxj.adapter;

/**
 * 类适配器模式：完成220v-5v的转变
 * 通过继承source类，实现destination类接口，完成srv-dst的适配
 * @author wbwangxj
 *
 */
public class VoltageAdapter extends Voltage200 implements Voltage5 {

	@Override
	public int output5V() {
		// TODO Auto-generated method stub
		int src = output220V();
		System.out.println("适配器工作开始适配电压");
		int dst = src / 44;
		System.out.println("适配器完成后输出电压： "+ dst);
		return dst;
	}

}
