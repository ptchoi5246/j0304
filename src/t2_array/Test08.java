package t2_array;

//2차원 배열
public class Test08 {
	public static void main(String[] args) {
		int[][ ]atom = new int[3][4];//앞: [행(세로)] 뒤[열(가로)]
		
		atom[0][1] = 10;
		atom[1][2] = 20;
		atom[2][0] = 30;
		
		for(int i=0; i<3; i++) { //천천히 도는게 바깥쪽 for문 행
			for(int j=0; j<4; j++) { //빠르게 도는게 안쪽 for문 열
				System.out.print(atom[i][j] + " / ");
			}
			System.out.println();
		}
	}
}
