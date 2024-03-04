package t1_memory;

//기본 객체 연산자 비교
public class Test02 {
	public static void main(String[] args) {
		int su1 = 10;
		int su2 = 20;
		int su3 = 10;
		
		if(su1 == su2) System.out.println("su1과 su2는 같습니다."); //기본 객체 연산자 비교
		else System.out.println("su1과 su2는 다릅니다.");
		
		if(su1 == su3) System.out.println("su1과 su3는 같습니다.");
		else System.out.println("su1과 su3는 다릅니다.");
		
	}
}
