package t2_array;

import java.util.Date;
import java.util.Scanner;

public class Test06_4 {
	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println("now : " + now); //날짜 기본 포맷 평식
		
		Scanner sc = new Scanner(System.in);
		String yn = ""; //객체형식 초기값 : null
		
		System.out.print("계속할까요?  (Yes/No)");
		yn = sc.next();
		System.out.println("입력된 문자 : " + yn);
		
		for(int i =0; i<yn.length(); i++) {
			if(yn.charAt(i) == 'Y') System.out.println("입력된 문자 중 Y가 있습니다.");
			else System.out.println("입력된 문자 중 Y가 없어요~!~!~!.");
		} 
		
		
		
		
		sc.close();
	}	
}
// ctrl + shift + o = import 단축기 3번째줄