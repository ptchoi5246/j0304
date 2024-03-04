package t2_array;
//초기값 외우기!
public class Test04 {
	public static void main(String[] args) { //String[] : 배열
		int[] su1 = new int[5];
		for(int i=0; i<5; i++) {
			System.out.println("su1["+i+"] = " +su1[i]); //초기값 0
		}
		System.out.println();
		
		double[] su2 = new double[5];
		for(int i=0; i<5; i++) {
			System.out.println("su2["+i+"] = " +su2[i]); //초기값 0.0
		}
		System.out.println();
		
		byte[] su3 = new byte[5];
		for(int i=0; i<5; i++) {
			System.out.println("su3["+i+"] = " +su3[i]); //초기값 0
		}
		System.out.println();
		
		char[] su4 = new char[5];
		for(int i=0; i<5; i++) {
			System.out.println("su4["+i+"] = " +su4[i]); //초기값  아무것도 나오지 않는다. 
		}
		System.out.println();
		
		short[] su5 = new short[5];
		for(int i=0; i<5; i++) {
			System.out.println("su5["+i+"] = " +su5[i]); //초기값 0
		}
		System.out.println();
		
		long[] su6 = new long[5];
		for(int i=0; i<5; i++) {
			System.out.println("su6["+i+"] = " +su6[i]); //초기값 0 
		}
		System.out.println();
		
		float[] su7 = new float[5];
		for(int i=0; i<5; i++) {
			System.out.println("float["+i+"] = " +su7[i]); //초기값 0.0 
		}
		System.out.println();
		
		boolean[] su8 = new boolean[5];
		for(int i=0; i<5; i++) {
			System.out.println("su8["+i+"] = " +su8[i]); //초기값 false 
		}
		System.out.println("=======================================");
		
		String[] str = new String[5]; //참조타입 기본값
		for(int i=0; i<str.length; i++) { //str.length 배열의 크기를 나타냄. 꼭 기억하기!
			System.out.println("str["+i+"] = " +str[i]); //초기값 null 
		}
	}
}
