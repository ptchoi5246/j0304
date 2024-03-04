package t2_array;

import java.util.Arrays; //Arrays 클래스 사용해서 올라옴

public class Test06_2 {
	public static void main(String[] args) {
		char[] strArray = {'K','o','r','e','a'};
		
		for(int i=0; i<strArray.length; i++) {
			System.out.print(strArray[i]); //Korea ln 지워서 한줄로 붙여서 출력
		}
		System.out.println();
		
		System.out.println(strArray); //char 타입의 배열은 문자와 문자의 결합이니까 문자열이 된다. 배열이름을 딱 찍으면 문자열이 된다.
		//char 타입 배열 = String 클래스처럼 사용할 수 있다.
		System.out.println("=====================");
		
		System.out.println("strArr의 길이 : " + strArray.length);
		System.out.println();
		
		System.out.println("strArray를 문자로 변환 : " + Arrays.toString(strArray)); //배열을 처리하는 클래스의 도움을 받아야한다. Arrays
		//문자를 문자열로 바꿨다. [K,o,r,e,a] 출력 / Arrays.toString 배열을 문자열로 바꿨다.
		System.out.println();
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println("strArray["+i+"] = " + strArray[i]);
		}
		System.out.println();
		
		String str = "Korea"; //문자열 -> 문자 배열로 바꾸고 싶다. 각각을 떼어내야 한다.
		//현재 문자열 중에서 특정 인덱스에 위치한 문자를 반환하고 싶어요 -> charAt()
		
		for(int i=0; i<str.length(); i++) { //str.length() 문자열을 구하는 메소드
			System.out.println("str("+i+") = " + str.charAt(i));
		}
	}	
}
