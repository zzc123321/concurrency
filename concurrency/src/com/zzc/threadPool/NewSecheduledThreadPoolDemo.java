package com.zzc.threadPool;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class NewSecheduledThreadPoolDemo {
	//创建任务执行器
	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

	public void execHour() {
		//声明要定时执行的任务
		final Runnable exec = new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName()+"线程开始执行" + new Date(System.currentTimeMillis()));
			}
		};
		//开启周期执行任务的计划
		final ScheduledFuture<?> execHandle = scheduler.scheduleAtFixedRate(exec, 10, 10, TimeUnit.SECONDS);
		//开启一个线程用于一小时后取消这个任务
		scheduler.schedule(new Runnable() {
			@Override
			public void run() {
				execHandle.cancel(true);
			}
		}, 60 * 60, TimeUnit.SECONDS);
	}

	public static void main(String[] args) {
		NewSecheduledThreadPoolDemo demo = new NewSecheduledThreadPoolDemo();
		demo.execHour();
	}
}
