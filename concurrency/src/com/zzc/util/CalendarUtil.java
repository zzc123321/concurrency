package com.zzc.util;

import java.util.Calendar;

public class CalendarUtil {
	private static final Calendar cale=Calendar.getInstance();
	/**
	 * 根据输入的年月日时分获取long值
	 * @param year
	 * @param month
	 * @param date
	 * @param hourOfDay
	 * @param minute
	 * @return
	 */
	public static long getMillions(int year,int month,int date,int hourOfDay,int minute){
		cale.set(year, month, date, hourOfDay, minute);
		return cale.getTimeInMillis();
	}
}
