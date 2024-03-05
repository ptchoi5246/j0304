package t3_exam;
//선택 정렬
public class Test04_SelectionSort_b_sw {
	public static void main(String[] args) {
		//int[] m = new int[6];//초기값을 바로 줄 경우
		//int[] m = new int[] {};//
		int[] m = {1,2,3,7,9,8}; //초기값 나열 할 때 =뒤에 바로 초기값 작성해도 된다.
		int temp = 0;
		int sw; //sw 선언
		//오름차순
		System.out.print("정렬자료 : ");
		for(int i=0; i<m.length; i++) {
			System.out.print(m[i] + " ");
		}
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			sw = 0;
			for(int j=i+1; j<=6; j++) {
				if(m[i-1] > m[j-1]) { //순서는 1234 배열은 0123 이니까 [배열 = 순서 -1]
					temp = m[i-1];
					m[i-1] = m[j-1];
					m[j-1] = temp;
					sw = 1; //안쪽 for문을 돌면 sw는 무조건 1 안돌면 0
				}
			}
			if(sw == 0) break;
		}
		
		System.out.print("정렬자료 : ");
		for(int i=0; i<m.length; i++) {
			System.out.print(m[i] + " ");
		}
	}
}

//오류, 미완성
