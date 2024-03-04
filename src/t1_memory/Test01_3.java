package t1_memory;

import java.util.Scanner;

public class Test01_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int ans = 0; //1:계속, 0:그만
		int cnt = 0;
		String ans = "N";
		
		while(true) {
			cnt++;
			System.out.println(cnt);
			System.out.print("작업을 계속 할까요? (Y:계속, N:그만)");
			ans = sc.next(); //nextLine : 여러개 받을 때
			//if(ans == "N") break; //안 끝남. ==는 기본 타입 연산자 값을 비교
			if(ans.equals("N")) break; //참조타입 객체비교 연산자 .equals 사용
		}
		System.out.println("작업 끝@");
		
		sc.close();
	}
}
