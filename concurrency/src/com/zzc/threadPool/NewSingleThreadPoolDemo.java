package com.zzc.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewSingleThreadPoolDemo {
	private final ExecutorService service=Executors.newSingleThreadExecutor();
	public  void exectorExec(){
		for(int i=0;i<10;i++){
			TestRunnable text=new TestRunnable();
			text.setI(i);
			service.execute(text);
		}
		service.shutdown();
		
	}
	public static void main(String[] args) {
		NewSingleThreadPoolDemo demo=new NewSingleThreadPoolDemo();
		demo.exectorExec();
	}
}
