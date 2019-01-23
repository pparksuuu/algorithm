package 기초코딩테스트;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class 캘_심플데이터포맷 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2015, 9, 3);
		
//		Date today = new Date();
		Date today = cal.getTime(); // Calendar를 Date으로 변환 
		
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;
		
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");	
		System.out.println(sdf1.format(today));
		
		sdf2 = new SimpleDateFormat("''yy년 MMM dd일 E요일");
		System.out.println(sdf2.format(today));
		
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(sdf3.format(today));
		
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf4.format(today));
		
		sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
		System.out.println(sdf5.format(today));
		
		sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");
		System.out.println(sdf6.format(today));
		
		sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");
		System.out.println(sdf7.format(today));
		
		sdf8 = new SimpleDateFormat("오늘은 이 달의 W번째 날입니다.");
		System.out.println(sdf8.format(today));
		
		sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다.");
		System.out.println(sdf9.format(today));
		
		System.out.println("====================================");
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		
		System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.(입력예: 2015/12/31)");
		
		while (s.hasNextLine()) {
			try {
				inDate = df.parse(s.nextLine()); // parse(String source)는 문자열 source를 날짜 Date 인스턴스로 변환해준다.
				break;
			} catch(Exception e) {
				System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요.");
			}
		}
		
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(inDate);
		Calendar today2 = Calendar.getInstance();
		
		long day = (cal2.getTimeInMillis() - today2.getTimeInMillis()) / (60 * 60 * 1000);
		System.out.println("입력하신 날짜는 현재와 " + day + "시간 차이가 있습니다.");
	}
}
