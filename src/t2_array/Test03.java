package t2_array;

//향상된 for문(객체 안의 내용을 반복처리 할 수 있다.)
public class Test03 {
	public static void main(String[] args) {
		int[] su = {100,80,50,30,70,60};
		
		System.out.println("일반적인 for문 출력");
		for(int i=0; i<su.length; i++) { //su.length : 배열의 갯수만큼 반복, 6개면 6개 반복
			System.out.print(su[i] + " ");
		}
		System.out.println();
		
		//향상된 for문 : for(변수타입 배열 안에 값을 담을 변수:객체(또는 배열명))
		System.out.println("향상된 for문 출력"); //순차적으로 출력, 몇 번지의 무엇인지는 알 수가 없음.
		for(int s :su) {
			System.out.print(s + " / ");
		}
		System.out.println();
		
		System.out.println("향상된 for문 출력(번지와 함께 출력하고자 한다.)"); //순차적으로 출력, 몇 번지의 무엇인지는 알 수가 없음.
		int sel = 0;
		for(int s :su) {
			System.out.println(sel + "번지 : " + s);
			sel++;
		}
		System.out.println();
	}
}
