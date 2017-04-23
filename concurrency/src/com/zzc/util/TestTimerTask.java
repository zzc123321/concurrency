package com.zzc.util;

import java.util.Date;
import java.util.TimerTask;

public class TestTimerTask extends TimerTask {

	@Override
	public void run() {
		try{
			System.out.println(Thread.currentThread()+"timerTask run at"+new Date(System.currentTimeMillis()));
			Thread.sleep(1000);
			}catch(Exception e ){
				e.printStackTrace();
				}
		
	}

}
