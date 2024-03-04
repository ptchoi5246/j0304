package t1_memory;

import java.util.Scanner;

//숫자를 입력 받아 작업을 계속, 끝
public class Test01_2b {
	public static void main(String[] args) {
		 
		String ans = "N"; //문자열 String "" 사용
		int	cnt = 0;
		
		Scanner sc = new Scanner(System.in);
			
		while(true) {
			cnt++; //횟수를 세기 위해 작성
			System.out.println(cnt);
			System.out.print("작업을 계속 할까요?   (Y: 계속, N:그만)");
			ans = sc.next(); //ans가 String이므로 next
			
			if(ans == "N") break; //작업이 끝나지 않는다.
			//==은 기본 타입 연산자 값을 비교하기 때문에
		}
		System.out.println("작업이 끝났습니다.  ");
		
		
		sc.close();
	}
}
