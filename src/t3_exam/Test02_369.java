package t3_exam;

/*
1번. 3,6,9 게임 : 배열, switching, charAt():문자 열을 문자로 빼두기 기법 사용
1~100까지의 수를 차례로 출력하되 3, 6, 9 자리는 숫자가 아닌, '짝'이라는 문자로 대치하시오.(한줄에 10개씩 출력하시오)
예) 1 2 짝 4 5 짝 7 ~~~~~ 28 짝 짝 짝 짝 짝짝 짝 짝 짝짝 짝 짝 짝짝 40 41 42 짝 44 ~~~
*/
public class Test02_369 {
	public static void main(String[] args) {
		String[] num = new String[100] ; //배열을 사용하니까 String 100개 방을 만든다.
		int sw; //switching 기법 사용, 기본타입은 초기값 무조건 입력!
		String temp; //누적변수
		//num[] 369 대신에 '짝' 문자열을 저장
		for(int i=0; i<num.length; i++) {//i<num.length 배열으 ㅣ전체 길이만큼 돌겠다 i<100
			num[i] = (i + 1) + ""; //문자 + 숫자 = 문자
			temp = ""; //누적해야 하니까 초기값 비워두기
			sw = 0; //짝 sw=1
			
			//문자의 길이만큼 첫번째꺼 비교, 두번째꺼 비교
			for(int j=0; j<num[i].length(); j++) { //j<num[i].length() 길이만큼 반복  
				if(num[i].charAt(j)=='3' || num[i].charAt(j)=='6' || num[i].charAt(j)=='9') { //num[0]. 0번 인덱스 : 10의 자리
					temp += "짝"; //"짝"이라는 문자열 누적
					sw = 1; //3,6,9, 한번이라도 했으면 sw, sw값 변경
				}
			} 
			if(sw == 1) num[i] = temp; //			
		}
		
		//num[]배열에 저장된 값을 10개씩 출력
			for(int i=0; i<num.length; i++) {
				System.out.print(num[i] + "\t");
				if((i+1) % 10 == 0) System.out.println(); 		
		}
	}
}
