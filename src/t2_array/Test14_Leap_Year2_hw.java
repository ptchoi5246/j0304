package t2_array;

import java.util.Scanner;

//년도와 달을 입력하면 해당 년도 월의 마지막 일자를 출력하는 프로그램을 완성하시오
//배열
public class Test14_Leap_Year2_hw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요~!  ");
		int year = sc.nextInt();
		
		System.out.print("월를 입력하세요~!  ");
		int month = sc.nextInt();
		
		if((year % 400) == 0 || (year % 4) == 0 && (year % 100) != 0)
			System.out.println(year + "  은 윤년입니다.");
		else
			System.out.println(year + "  은 평년입니다.");
				
		sc.close();
	}
}
