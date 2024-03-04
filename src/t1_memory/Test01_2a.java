package t1_memory;

import java.util.Scanner;

public class Test01_2a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		String ans = "N";
		
		while(true){
			cnt++;
			System.out.println(cnt);
			System.out.println("작업을 계속 하시겠습니까?   (Y: 계속, N: 그만");
			ans = sc.next(); //ans = String 이라서 sc.nextInt 사용 불가
			if(ans == "N") break; // break 실패!!
		}
		System.out.println("작업 끝~!~!~!");
		sc.close();
	}
}
