package 기초코딩테스트_트레이닝;

import java.util.Calendar;

public class 캘린더 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(Calendar.DATE));
		System.out.println(today.get(Calendar.DAY_OF_MONTH));
		System.out.println(today.get(Calendar.DAY_OF_WEEK));
		System.out.println(today.getActualMaximum(Calendar.DATE));
		
		final String[] DAY_OF_WEEK = {"", "월", "화", "수", "목", "금", "토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date2.set(2019, 0, 22);
		System.out.println("date1은 " + toString(date1) 
		+ DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일");
		System.out.println("date2는" + toString(date2) 
		+ DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일");
		
		long differ = (date1.getTimeInMillis() - date2.getTimeInMillis()) / 1000;
		System.out.println(differ / (60 * 60 * 24));
		
		// 시, 분, 초
		date1.add(Calendar.DATE, 1);
		System.out.println("1일 후 : " + toString(date1));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일 ";
	}
}
