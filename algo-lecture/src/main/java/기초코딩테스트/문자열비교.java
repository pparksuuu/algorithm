package 기초코딩테스트;

/*
http://tworab.tistory.com/16
*/
public class 문자열비교 {
	public static void main(String[] args) {
		String a1 = "Suhyeon";
		String a2 = "SUHYEON";
		String a3 = new String("Suhyeon");
		
		// 1) equals() method에 의한 문자열 비교.
		// equals() method는 문자열의 원본 내용을 비교한다. 즉, 동일한 문자열 값을 비교한다.
		System.out.println(a1.equals(a2)); // false
		System.out.println(a1.equalsIgnoreCase(a2)); //true
		
		// 2) == 연산자(Operator)에 의한 비교.
		// ==operator는 값이 아닌 참조를 비교한다.
		String b1 = "Suhyeon";
		String b2 = "Suhyeon";
		String b3 = new String("Suhyeon");
		
		System.out.println(b1 == b2); // true (because both refer to same instance)
		System.out.println(b1 == b3); // false (because s3 refers to instance created in nonpool)
		
		// 3) compareTo() method에 의한 문자열 비교
		// 문자열의 사전적 값을 비교.
		// 만약 처음 문자열이 두 번째 문자열보다 적거나 같거나 크다면, 해당하는 정수 값 반환
		// s1 == s2 : 0
		// s1 > s2 : positive value
		// s1 < s2 : negative value
		
		String c1 = "Suhyeon";
		String c2 = "Suhyeon";
		String c3 = "Hola";
		System.out.println(c1.compareTo(c2)); // 0
		System.out.println(c1.compareTo(c3)); // (because c1 > c3)
		System.out.println(c3.compareTo(c1)); // (because c3 < c1)
	}
}
