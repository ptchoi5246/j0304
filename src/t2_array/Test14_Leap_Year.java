package t2_array;

import java.util.Scanner;

//윤년? 1.4로 나눠 떨어지면 윤연? 2.이 때 100으로 나눠 떨어지면 평년? 3.이 년도가 400으로 나눠 떨어지면 비로소 윤년이다.
public class Test14_Leap_Year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요~!  ");
		int year = sc.nextInt();
		
		//if((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0)
		if((year % 400) == 0 || ((year % 4) == 0 && (year % 100) != 0)) //시간복잡도 때문에 or 조건을 제일 먼저 작성하는게 좋다.
			System.out.println(year + "  은 윤년입니다.");
		else
			System.out.println(year + "  은 평년입니다.");
				
		sc.close();
	}
}
