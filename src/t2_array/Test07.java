package t2_array;

//2차원 배열
public class Test07 {
	public static void main(String[] args) {
		int[][ ]atom = new int[3][4];//앞: [행(세로)] 뒤[열(가로)]
		
		for(int i=0; i<4; i++) { //5번 반복 0 1 2 3 4 
			System.out.print(atom[0][i] + " / "); // 0/0/0/0/0/ 출력
		}
		System.out.println();
		
		for(int i=0; i<4; i++) {  
			System.out.print(atom[1][i] + " / ");
		}
		System.out.println();

		for(int i=0; i<4; i++) {  
			System.out.print(atom[2][i] + " / ");
		}
		System.out.println();
		System.out.println("====================");
		
		for(int i=0; i<3; i++) { //천천히 도는게 바깥쪽 for문
			for(int j=0; j<4; j++) { //빠르게 도는게 안쪽 for문
				System.out.print(atom[i][j] + " / ");
			}
			System.out.println();
		}
	}
}
