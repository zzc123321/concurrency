package com.zzc.threadPool;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.zzc.util.CalendarUtil;

public class TestSecheduledThreadPool {
	// 创建任务执行器
	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

	public void execHour(long beginTimeDelay) {
		// 声明要定时执行的任务
		final Runnable exec = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + "线程开始执行" + new Date(System.currentTimeMillis()));
			}
		};
		// 开启周期执行任务的计划
		scheduler.scheduleAtFixedRate(exec, 10, 1000 * 60 * 60 * 24, TimeUnit.MILLISECONDS);
	}

	public static void main(String[] args) {
		TestSecheduledThreadPool demo = new TestSecheduledThreadPool();
		//设置第一次执行任务的日期
		long beginTime=CalendarUtil.getMillions(2017, 4, 24, 2, 0);
		//获取到达指定时间运行需要延迟的时间
		long beginTimeDelay=Math.abs(beginTime-System.currentTimeMillis());
		demo.execHour(beginTimeDelay);
	}
}
