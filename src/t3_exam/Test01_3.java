package t3_exam;

import java.util.Scanner;

//최대값, 최소값 구하기 - Two Read, 초기값 방식 2가지
//2자리 이하의 정수가 입력된다.
public class Test01_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = -99, min = 99, su, cnt = 0; 
		int[] arr = new int[200]; 
		
		while(true) { //숫자를 입력받는다.
			System.out.print("정수를 입력하세요~!  (종료 : 999)");
			su = sc.nextInt();
			if(su == 999) break;
			
			arr[cnt] = su; 
			cnt++; 
		
		}
		
		for(int i=0; i<cnt; i++) {
			
						
			if(arr[i] > max) max = arr[i]; //입력받은 수 : arr[i]
			if(arr[i] < min) min = arr[i];
		}
		//입력 받은 수를 차례대로 출력하시오
		for(int i=0; i<cnt; i++) { 
			System.out.print(arr[i] + " / "); 
		}
		System.out.println(); //줄바꿈
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
		
		sc.close();
	
	}
}


//선언부 입력부 처리부 출력부


