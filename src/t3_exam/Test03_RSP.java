package t3_exam;

import java.util.Scanner;

/*
2번. 가위/바위/보 게임 RSP :: 숫자 비교로 나타내기, 연산
컴퓨터에게 랜덤하게 '가위/바위/보'중의 하나를 기억시켜놓고, 사용자가 '가위/바위/보'중에서 하나를 입력하면
누가 이겼는지를 출력처리한다.(단, '그만'을 입력하면 프로그램을 종료처리한다)
 */
public class Test03_RSP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println(" #가위/바위/보 게임# ");
		
		while(true) { //정수형 난수 발생
			int computer = (int)(Math.random()*3)+1; //컴퓨터 정수형 난수 발생 1~3가지 //1:가위 2:바위 3:보
			//난수 -> 정수형 강제 casting 해야하니까 난수 앞에 (int) 작성
			int na;
			
			System.out.print("1:가위 2:바위 3:보 0:종료를 입력하세요~!    "); //숫자 입력하면 문자로 출력
			na = sc.nextInt();//입력받는 변수 na; 숫자를 입력받는다  
			if(na == 0) break; //탈출구 먼저 작성하기
			
			int temp = na - computer;
			//결과: 내가 입력한 값 - 컴퓨터 = 0 : 무승부
			//결과: 내가 입력한 값 - 컴퓨터 = -2 또는 1 : na 승리
			//나머지 : na 패배
			
			if(temp == 0)System.out.println("무승부"); // 나-컴퓨터 =0 : 무승부
			else if(temp == 1 || temp == -2) System.out.println("WIN"); // 나-컴퓨터 =1 또는 -2 : 나 승리
			else System.out.println("LOSE"); // 나머지 : 나 패배
			
			System.out.print("계속 하시겠습니까? Y/N    ");
			String yn = sc.next(); //문자열 yn로 입력 받음 //문자열이니까 next{}
			if(yn.equals("N") || yn.equals("n")) break; //대문자, 소문자 로 입력 받음			
		}
		System.out.println("게임을 종료합니다.");
		
		sc.close();
	}
}
