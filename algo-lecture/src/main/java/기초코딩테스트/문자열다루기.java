package 기초코딩테스트;

public class 문자열다루기 {
	public static void main(String[] args) {
		String str1 = "Hello World!!";
		
		// indexOf : 지정 문자열이 몇번째에 있는지 찾아서 반환
		int index = str1.indexOf("World");
		System.out.println(index);
		
		// split : 특정 문자열을 배열로 분리
		str1 = "Hello|World!!";
		String[] arr = str1.split("\\|");
		for (int i = 0; i < arr.length; i++) 
			System.out.println(arr[i]);
		
		// replace : 문자열 치환
		str1 = "Hello World!";
		String str2 = str1.replace("!", "@@");
		System.out.println(str2);
		
		// substring : 특정영역 문자열을 가져오기
		str1 = "Hello World!";
		str2 = str1.substring(6, 9);
		System.out.println(str2);
		
		// startWith : 앞부분 부터 비교하기
		str1 = "Hello World!!";
		if (str1.startsWith("Hel"))
			System.out.println("That's Right");
		
		// endWith : 뒷부분 부터 비교하기
		str1 = "Hello World!";
		if (str1.endsWith("d!"))
			System.out.println("That's also Right");
		
		// contains : 문자열 포함하고 있는지 불리안 값으로 리턴
		str1 = "Helfjaivaglr";
		if (str1.contains("jai"))
			System.out.println("들어있어");
		
		// StringBuilder 사용하여 문자열 합치기.
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append(" Suhyeon");
		System.out.println(sb);
	}
}
