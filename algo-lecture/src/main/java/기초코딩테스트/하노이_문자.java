package 기초코딩테스트;

public class 하노이_문자 {
	static int num_disk = 5;
	
	public static void main(String[] args) {
		moveDisk(num_disk, 'A', 'B', 'C');
	}
	
	public static void moveDisk(int top, char from, char mid, char to) {
		if (top == 1) 
			System.out.println("원판 1이 기둥 " + from + "에서 기둥 " + to + "로 이동");
		else {
			moveDisk(top - 1, from, to, mid);
			System.out.println("원판" + top + "이 기둥 " + from + "에서 기둥" + to + "로 이동");
			moveDisk(top - 1, mid, from, to);
		} 
	}
}
