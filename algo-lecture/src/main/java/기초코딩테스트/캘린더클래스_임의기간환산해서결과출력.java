package 기초코딩테스트;

import java.util.Calendar;

public class 캘린더클래스_임의기간환산해서결과출력 {
	public static void main(String[] args) {
		// 기본적으로 현재날짜와 시간으로 설정된다.
		Calendar today = Calendar.getInstance();
		
		System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
		System.out.println("월(0 ~ 11, 0: 1월) : " + today.get(Calendar.MONTH)); // 주의 !!!!! 1을 더해줘야 제대로 월이 나옴.
		System.out.println("이 해의 몇째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		
		// DATE와 DAY_OF_MONTH는 같다.
		System.out.println("이 달의 몇 일 : " + today.get(Calendar.DATE));
		System.out.println("이 달의 몇 일 : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 몇 일 : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1 ~ 7, 1: 일요일) : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("이 달의 몇 째 요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // 이 달의 N번째 월요일
		System.out.println("오전_오후(0 : 오전, 1: 오후) : " + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));
		System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59) : " + today.get(Calendar.MINUTE));
		System.out.println("초(0~59) : " + today.get(Calendar.SECOND));
		System.out.println("1000분의 1초(0~999) : " + today.get(Calendar.MILLISECOND));
		
		// 천분의 1초를 시간으로 표시하기 위해 3_600_000으로 나누었다. (1시간 = 60 * 60초)
		System.out.println("TimeZone(-12 ~ +12) :" + today.get(Calendar.ZONE_OFFSET));
		System.out.println("이 달의 마지막 날 : " + today.getActualMaximum(Calendar.DATE));
		
		System.out.println("===========================================");
		
		// 요일은 1부터 시작하기 떄문에, DAY_OF_WEEK[0]은 비워두었다.
		final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		// month의 경우 0부터 시작하기 때문에 8월인 경우, 7로 지정해야 한다.
		// date1.set(2015, Calendar.AUGUST, 15); 와 같이 할 수도 있다.
		date1.set(2015, 7, 15); // 2015년 8월 15일로 날짜 설정.
		System.out.println("date1은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고, ");
		System.out.println("date2은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다. ");
		
		// 두 날짜간의 차이를 얻으려면, getTimeInMillis() 천분의 일초 단위로 변환해야 한다.
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println("그 날(date1)부터 지금(date2)까지 " + difference + "초가 지났습니다.");
		System.out.println("일(day)로 계산하면 " + difference / (24 * 60 * 60) + "일입니다."); // 1일 = 24 * 60 * 60
		
		System.out.println("===========================================");
		
		final int[] TIME_UNIT = {3600, 60, 1}; // 큰 단위를 앞에 놓는다.
		final String[] TIME_UNIT_NAME = {"시간", "분", "초"};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY, 10); // time1을 10시 20분 30초로 설정
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		System.out.println("time1 : " + time1.get(Calendar.HOUR_OF_DAY) + "시 " 
				+ time1.get(Calendar.MINUTE) + "분 " + time1.get(Calendar.SECOND) + "초"); 
		System.out.println("time2 : " + time2.get(Calendar.HOUR_OF_DAY) + "시 " 
				+ time2.get(Calendar.MINUTE) + "분 " + time2.get(Calendar.SECOND) + "초"); 
		
		long differ = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000;
		System.out.println("time1과 time2의 차이는 " + differ + "초 입니다.");
		
		String tmp = "";
		for (int i = 0; i < TIME_UNIT.length; i++) {
			tmp += differ/TIME_UNIT[i] + TIME_UNIT_NAME[i];
			differ %= TIME_UNIT[i];
		}
		System.out.println("시분초로 변환하면 " + tmp + "입니다.");
		
		System.out.println("===========================================");
		
		Calendar date4 = Calendar.getInstance();
		date4.set(2005, 8, 31); // 2005년 8월 31일
		System.out.println(toString(date4));
		
		System.out.println("= 1일 후 =");
		date4.add(Calendar.DATE, 1);
		System.out.println(toString(date4));
		
		System.out.println("=6달 전=");
		date4.add(Calendar.MONTH, -6);
		System.out.println(toString(date4));
		
		System.out.println("=31일 후(roll) ="); // 월 필드는 넘어가지 않고 일 필드의 값만 바뀐다(roll의 경우)
		date4.roll(Calendar.DATE, 31);
		System.out.println(toString(date4));
		
		System.out.println("=31일 후(add) =");
		date4.add(Calendar.DATE, 31);
		System.out.println(toString(date4));
		
		// roll의 단 한가지 예외는 월필드를 변경하면 일필드에 영향을 미칠 수 있음.
		date4.set(2015, 0, 31);
		System.out.println(toString(date4));
		date4.roll(Calendar.MONTH, 1);
		System.out.println(toString(date4));
		
		System.out.println("===========================================");
 	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일 ";
	}
}
