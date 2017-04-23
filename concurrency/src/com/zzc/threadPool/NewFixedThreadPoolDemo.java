package com.zzc.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewFixedThreadPoolDemo {
	//创建一个长度为2的线程池
	private final ExecutorService service=Executors.newFixedThreadPool(2);
	public  void exectorExec(){
		for(int i = 0;i<10;i++){
			TestRunnable text=new TestRunnable();
			service.execute(text);
		}
		
	}
	public static void main(String[] args) {
		NewFixedThreadPoolDemo demo=new NewFixedThreadPoolDemo();
		demo.exectorExec();
	}
	
}
