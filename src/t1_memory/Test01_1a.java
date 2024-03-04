package t1_memory;

import java.util.Scanner;
//숫자를 입력 받아 작업을 계속, 끝
public class Test01_1a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ans = 0;
		int cnt = 0;
		while(true) {
			cnt++;
			System.out.println(cnt);
			System.out.println("작업을 계속 할까요?  (1: 계속, 0: 그만)");
			ans = sc.nextInt(); //1, 0만 입력해도 계속 그만 출력
			if(ans == 0) break;			
		}
		System.out.println("작업 끝~!!!   ");
		sc.close();		
	}
}
