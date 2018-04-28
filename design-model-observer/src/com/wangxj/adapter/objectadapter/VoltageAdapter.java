package com.wangxj.adapter.objectadapter;

import com.wangxj.adapter.Voltage200;
import com.wangxj.adapter.Voltage5;

/**
 * 对象适配器类模式：完成220v-5v的转变
 * 通过继承source类，实现destination类接口，完成srv-dst的适配
 * @author wbwangxj
 *
 */
public class VoltageAdapter implements Voltage5 {
	
	private Voltage200 mvaltage220;
	
	public VoltageAdapter(Voltage200 valtage220) {
		super();
		this.mvaltage220 = valtage220;
	}


	@Override
	public int output5V() {
		int dst = 0;
		if(mvaltage220 != null) {
			int src = mvaltage220.output220V();
			System.out.println("对象适配器工作，开始适配电压");
			dst = src / 44;
			System.out.println("适配完成后输出电压： " + dst);
		}
		return dst;
	}

}
