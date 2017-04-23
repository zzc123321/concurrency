package com.zzc.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewCachedThreadPoolDemo {
	private final ExecutorService service=Executors.newCachedThreadPool();
	public  void exectorExec(){
		for(int i=0;i<10;i++){
			TestRunnable text=new TestRunnable();
			text.setI(i);
			service.execute(text);
		}
		
	}
	public static void main(String[] args) {
		NewCachedThreadPoolDemo demo=new NewCachedThreadPoolDemo();
		demo.exectorExec();
	}
}
