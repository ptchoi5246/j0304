package t2_array;

import java.util.Arrays;
import java.util.Scanner;

//Arrays클래스 사용법
public class Test13_Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] m = new int[10]; //배열 먼저 크기를 줘야한다.
		int su, cnt = 0; //cnt누적
		
		//입력된 자료를 배열에 저장하기 (for문을 사용하는 것이 더 효율 적이다 : 10개 정수 딱 정해져있음)
		while(true) { //for문 돌리는게 좋다.
			cnt++;
			System.out.print(cnt + ". 10개의 두자리 정수를 입력하세요~!   (종료시 999)  ");
			su = sc.nextInt();
			m[cnt-1] = su; //입력 받은 수를 m배열에 누적
			if(cnt == 10) break;
		}
		
		//원본 자료 출력
		System.out.print("원본 데이터 : ");
		for(int i=0; i<m.length; i++) {
			System.out.print(m[i] + " / ");
		}
		System.out.println();
		
		// Arrays 클래스의 sort()메소드를 이용한 자료의 정렬
		Arrays.sort(m); //m배열 정렬 오름차순으로
		
		//정렬 자료 출력
		System.out.print("정렬 데이터 : ");
		for(int i=0; i<m.length; i++) {
			System.out.print(m[i] + " / ");
		}				
		sc.close();		
	}
}
//소스복사
