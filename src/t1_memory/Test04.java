package t1_memory;

//참조타입 객체 연산자 비교
//새로운 객체를 만들고 싶다면 정말로 객체를 새로 만들어야한다. new
public class Test04 {
	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = new String("홍길동"); //정말로 객체를 새로 만들어야한다. new !!!엄청 중요하다!!!
	
		
		if(name1 == name2) System.out.println("name1과 name2는 같습니다.");
		else System.out.println("name1과 name2는 다릅니다."); //출력
		System.out.println();
		
		if(name1.equals("홍길동")) System.out.println("name1은 '홍길동' 입니다."); //출력
		else System.out.println("name1은 '홍길동'이 아닙니다.");
		System.out.println();
		
		if(name1.equals(name2)) System.out.println("name1과 name2는 같습니다."); //출력
		else System.out.println("name1과 name2는 다릅니다.");
		//equals는 name 1, name2 가 가르키는 주소지를 비교한다.
		//주소지는 다르지만 문자열의 값이 같으니까 같다
		
	}
}

//원래는 "name1과 name2는 같습니다." 이렇게 출력되면 안 된다.
//지금부터 헷갈린다. 
//JVM에 힙 영역에 동일한 항목이 있으면 새로 만들지 않고 같이 사용
//새로운 객체를 만들고 싶다면 정말로 객체를 새로 만들어야한다. new