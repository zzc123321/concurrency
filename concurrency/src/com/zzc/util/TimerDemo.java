package com.zzc.util;

import java.util.Date;
import java.util.Timer;

public class TimerDemo {
	public static final Timer tim=new Timer();
	public static void main(String[] args) {
		//执行日期
		Date time=new Date();
		long period=24*60*60*1000;//每天执行一次
		//创建timertask任务
		TestTimerTask task =new TestTimerTask();
		//计划任务开启
//		tim.schedule(task, time);
		//每天的这个时候执行一次
		tim.schedule(task, time, period);
	}
}
