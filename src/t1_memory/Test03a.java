package t1_memory;

//참조타입 객체 연산자 비교
public class Test03a {
	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";
	
		
		if(name1 == name2) System.out.println("name1과 name2는 같습니다."); //출력
		else System.out.println("name1과 name2는 다릅니다.");
		System.out.println();
		
		if(name1.equals("홍길동")) System.out.println("name1은 '홍길동' 입니다."); //출력
		else System.out.println("name1은 '홍길동'이 아닙니다.");
		System.out.println();
		
		if(name1.equals(name2)) System.out.println("name1과 name2는 같습니다."); //출력
		else System.out.println("name1과 name2는 다릅니다.");
		
	}
}

//원래는 "name1과 name2는 같습니다." 이렇게 출력되면 안 된다.
//지금부터 헷갈린다. 
//JVM에 힙 영역에 동일한 항목이 있으면 새로 만들지 않고 같이 사용