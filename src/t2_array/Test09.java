package t2_array;

//2차원 배열 (규칙 값 저장)
/*
  1  2  3  4
  5  6  7  8 
  9 10 11 12
 */
public class Test09 {
	public static void main(String[] args) {
		int[][ ]atom = new int[3][4];//앞: [행(세로)] 뒤[열(가로)]
		
		//값 기억시키기
		int cnt = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				cnt++;
				atom[i][j] = cnt;
			}
		}
		
		//배열에 저장된 형태 그대로 출력하기
		
			
		for(int i=0; i<3; i++) { //천천히 도는게 바깥쪽 for문 행
			for(int j=0; j<4; j++) { //빠르게 도는게 안쪽 for문 열
				System.out.print(atom[i][j] + " \t ");
			}
			System.out.println();
		}
	}
}
