package t1_memory;

import java.util.Scanner;

//숫자를 입력 받아 작업을 계속, 끝
public class Test01_1b {
	public static void main(String[] args) {
		 
		int ans = 0, cnt = 0;
		
		Scanner sc = new Scanner(System.in);
			
		while(true) {
			cnt++; //횟수를 세기 위해 작성
			System.out.println(cnt);
			System.out.print("작업을 계속 할까요?   (1: 계속, 0:그만)");
			ans = sc.nextInt();
			
			if(ans == 0) break;
		}
		System.out.println("작업이 끝났습니다.  ");
		
		
		sc.close();
	}
}
