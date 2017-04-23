package com.zzc.threadPool;

import java.util.Date;
/**
 * 测试的线程
 * @author zzc
 *
 */
public class TestRunnable implements Runnable {

		private String name;
		private int i=1;
		public void run() {
			
			System.out.println(Thread.currentThread().getName() +"线程开始执行" + new Date(System.currentTimeMillis()));
			try {
				Thread.sleep(i*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() +"线程执行结束" + new Date(System.currentTimeMillis()));
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getI() {
			return i;
		}
		public void setI(int i) {
			this.i = i;
		}
	
	

}
