package t2_array;

import java.util.Scanner;

//2차원 배열 연습(100명 이내의 학생이 입력된다.)
public class Test15_2Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//작업에 필요한 변수 정의
		String[] name = new String[100]; //1차원 배열
		int[][] jumsu = new int[100][4]; //2차원 배열 : 행 인원수 열 점수
		double[] avg = new double[100];
		char[] gr = new char[100];
		int cnt = 0, tot = 0, total = 0; //인원수 cnt 누적 tot 총합계total
		
		String[] title = {"성명","국어","영어","수학","총점","평균","학점"};  
		
		//학생 자료 입력과 계산처리 //바깥 for 사람
		for(int i=0; i<name.length; i++) { //이름
			System.out.print("학생 이름을 입력하세요~!  (종료시 999) :: ");
			name[i] = sc.next();
			if(name[i].equals("999")) break;
			//안쪽 for 과목 점수
			for(int j=0; j<3; j++) { //점수
				System.out.println(title[j+1] + "점수를 입력하세요~!  "); //j[0] = 성명이니까 국어부터 입력 받아야되니까 j+1
				jumsu[i][j] = sc.nextInt(); //jumsu[학생이름에 해당하는 점수][과목 점수]
				tot += jumsu[i][j]; //점수 누적 
			}
			jumsu[i][3] = tot; //총점 //[행]의[열] : 열이 값 고정 3 
			avg[i] = tot / 3.0; //평균
			if(avg[i] >= 90) gr[i] = 'A';
			else if(avg[i] >= 80) gr[i] = 'B';
			else if(avg[i] >= 70) gr[i] = 'C';
			else if(avg[i] >= 60) gr[i] = 'D';
			else gr[i] = 'F'; //학점
			total += tot;
			tot = 0; //한사람 끝 - 클리어하기! 총점을 클리어!
			cnt++; //카운트하기			
		} //입력과 계산 처리 끝
		
		//입력한 학생 자료와 계산된 값들을 출력처리
		System.out.println("\n\t\t***** 성 적 표 *****");
		System.out.println("===================================================================================");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------------------------------------------");
		for(int i=0; i<cnt; i++) {
			System.out.print((i+1)+ "\t" +name[i]+ "\t");
			for(int j=0; j<4; j++) {
				System.out.print(jumsu[i][j] + "\t"); //2차원 배열 국어~총점
			}
			System.out.printf("%.2f\t%c\n", avg[i], gr[i]); //소수점 잘라야된다.printf			
		}		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.printf("\t\t\t총평균 %.2f, 인원수 : %d명\n", ((double)total/cnt/3), cnt);
		
		sc.close();
	}
}
