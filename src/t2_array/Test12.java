package t2_array;

// 배열의 복사(깊은복사, 얕은복사)
public class Test12 {
	public static void main(String[] args) {
		int[] su1 = {1,2,3,4,5,6};

		// int[] su2 = new int[5]; //su1의 값을 su2의 값으로 복사
		int[] su2 = new int[su1.length]; //su1의 값이 가변하여 su1.length로 입력
		int[] su3 = new int[su1.length];
		
		System.out.println("su1배열 : ");
		for(int i=0; i<su1.length; i++) {
			System.out.print(su1[i] + " ");
		}
		System.out.println("\n");
		
		System.out.println("su2배열 : ");
		for(int i=0; i<su2.length; i++) {
			System.out.print(su2[i] + " ");
		}
		System.out.println("\n");
		
		
		//배열 복사 (깊은 복사) : 값을 완전히 준다
		for(int i=0; i<su1.length; i++) {
			su2[i] = su1[i]; //su1에 있는걸 su2로 준다.
		}	
		System.out.println("su2배열 : ");
		for(int i=0; i<su2.length; i++) {
			System.out.print(su2[i] + " ");
		}
		System.out.println("\n");
			
		//배열복사 (얕은 복사)	:번지만 준다 = 같은 주소를 가르킨다
		su3 = su1; 
				
		System.out.println("su3배열 : ");
		for(int i=0; i<su2.length; i++) {
			System.out.print(su3[i] + " ");
		}
		System.out.println("\n");
			
		//su1 주소의 값을 변경 후 확인해보자.
		su1[4] = 500;
		System.out.println("su1배열 : ");
		for(int i=0; i<su1.length; i++) {
			System.out.print(su1[i] + " ");
		}
		System.out.println("\n");
		
		System.out.println("su3배열 : ");
		for(int i=0; i<su3.length; i++) {
			System.out.print(su3[i] + " ");
		}
		System.out.println("\n");
		
		System.out.println("su2배열 : ");
		for(int i=0; i<su2.length; i++) {
			System.out.print(su2[i] + " ");
		}
		System.out.println("\n");
		
	}
}
