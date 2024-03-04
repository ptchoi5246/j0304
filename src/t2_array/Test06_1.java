package t2_array;

public class Test06_1 {
	public static void main(String[] args) {
		char[] strArray = {'K','o','r','e','a'};
		
		for(int i=0; i<strArray.length; i++) {
			System.out.print(strArray[i]); //Korea ln 지워서 한줄로 붙여서 출력
		}
		System.out.println();
		
		System.out.println(strArray); //char 타입의 배열은 문자와 문자의 결합이니까 문자열이 된다. 배열이름을 딱 찍으면 문자열이 된다.
		//char 타입 배열 = String 클래스처럼 사용할 수 있다.
	}	
}
