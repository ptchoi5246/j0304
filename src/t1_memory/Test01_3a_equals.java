package t1_memory;

import java.util.Scanner;

public class Test01_3a_equals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		String ans = "N";
		
		while(true) {
			cnt++;
			System.out.println(cnt);
			System.out.println("작업을 계속 하시겠습니까? (Y: 계속, N: 그만)");
			ans = sc.next();
			if(ans.equals("N")) break; //break 실행
		} //참조타입 객체비교 연산자 .equals
		System.out.println("작업 끝~!~!~!");
		
		sc.close();
	}

}
