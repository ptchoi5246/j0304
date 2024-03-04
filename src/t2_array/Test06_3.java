package t2_array;

import java.util.Date;
import java.util.Scanner;

public class Test06_3 {
	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println("now : " + now); //날짜 기본 포맷 평식
		
		Scanner sc = new Scanner(System.in);
		String yn = ""; //객체형식 초기값 : null
		
		System.out.print("계속할까요?  (Yes/No)");
		yn = sc.next();
		System.out.println("입력된 문자 : " + yn);
		
		for(int i =0; i<yn.length(); i++) {
			if(yn.equals("Y")) System.out.println("입력된 문자는 Y 입니다.");
			else System.out.println("입력된 문자는 Y가 아닙니다.");
		} 
		
		
		
		
		sc.close();
	}	
}
// ctrl + shift + o = import 단축기 3번째줄
//문자 문자 비교는 char 문자 == 문자 ''
//문자열 비교 .equals로 비교 ""