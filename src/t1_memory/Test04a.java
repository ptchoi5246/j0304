package t1_memory;

//참조타입 객체 연산자 비교
//새로운 객체를 만들고 싶다면 정말로 객체를 새로 만들어야한다. new
public class Test04a {
	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = new String("홍길동"); //새로운 문자열 객체
	
		
		if(name1 == name2) System.out.println("name1과 name2는 같습니다."); 
		else System.out.println("name1과 name2는 다릅니다."); //출력
		System.out.println();
		
		if(name1.equals("홍길동")) System.out.println("name1은 '홍길동' 입니다."); //출력
		else System.out.println("name1은 '홍길동'이 아닙니다.");
		System.out.println();
		
		if(name1.equals(name2)) System.out.println("name1과 name2는 같습니다."); //출력
		else System.out.println("name1과 name2는 다릅니다.");
		//.equals는 name1, name2 가르키는 주소지를 비교한다.
		//주소지는 다르지만 문자열 값이 같으니까 같다.
	}
}
