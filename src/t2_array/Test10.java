package t2_array;

//2차원 배열 (규칙 값 저장)
/*
   4   3  2 1
   8   7  6 5 
  12  11 10 9
 */
public class Test10 {
	public static void main(String[] args) {
		int[][ ]atom = new int[3][4];//앞: [행(세로)] 뒤[열(가로)]
		
		//값 기억시키기
		int cnt = 5;
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) { //열 세로 5-cnt = cnt = 4 3 2 1
				cnt--;
				atom[i][j] = cnt;
			}
			cnt += 8; //cnt가 1일 때 안쪽 for문 탈출, 8을 만들어줘야하니까 cnt += 7인데 안쪽 for문에 cnt--;가 있으니까 cnt+=8로 작성 
		}
		
		//배열에 저장된 형태 그대로 출력하기, 출력 고정			
		for(int i=0; i<3; i++) { //천천히 도는게 바깥쪽 for문 행
			for(int j=0; j<4; j++) { //빠르게 도는게 안쪽 for문 열
				System.out.print(atom[i][j] + " \t ");
			}
			System.out.println();
		}
	}
}
