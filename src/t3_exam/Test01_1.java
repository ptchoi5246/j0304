package t3_exam;

import java.util.Scanner;

//최대값, 최소값 구하기 - Two Read, 초기값 방식 2가지
//2자리 이하의 정수가 입력된다.
public class Test01_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = -99, min = 99, su; //초기값 방식
		
		while(true) {
			System.out.print("정수를 입력하세요~!  (종료 : 999)");
			su = sc.nextInt();
			if(su == 999) break;
			
			if(su > max) max = su;
			if(su < min) min = su; //else 사용하지 않기 - 오류 발생
		}
	
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
		
		sc.close();
	
	}
}



