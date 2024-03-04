package t3_exam;

import java.util.Scanner;

//최대값, 최소값 구하기 - Two Read, 초기값 방식 2가지
//2자리 이하의 정수가 입력된다.
public class Test01_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = -99, min = 99, su, cnt = 0; //초기값 방식
		int[] arr = new int[200]; //배열 생성 *배열의 단점 : 사용하지 않더라도 선언을 해야한다.
		
		while(true) { //숫자를 입력받는다.
			System.out.print("정수를 입력하세요~!  (종료 : 999)");
			su = sc.nextInt();
			if(su == 999) break;
			
			arr[cnt] = su; //배열 arr의 0번지에 입력받은 숫자 su 넣기 *** : 제일 앞 0번지에 입력한 숫자 들어간다.
			cnt++; //다음엔 1번지 방은 5개지만 번지는 4개 (cnt-) (갯수, 번지?)***
			
						
			if(su > max) max = su;
			if(su < min) min = su; //else 사용하지 않기 - 오류 발생
		}
		//입력 받은 수를 차례대로 출력하시오
		for(int i=0; i<cnt; i++) { //int i=1; i<=cnt-1
			System.out.print(arr[i] + " / "); 
		}
		System.out.println(); //줄바꿈
		System.out.println("최대값 : " + max + ", 최소값 : " + min);
		
		sc.close();
	
	}
}



