package t2_array;

//2차원 배열(불규칙 값 저장)
/*
  100 90 80  50 //행의 크기 : 배열의 길이 atom.length
   80 50 
   90 10 20  90
  100 10 20
 */
public class Test11_3 {
	public static void main(String[] args) {
		int[][ ]atom =
			{
				{100,90,80,50},
				{80,50},
				{90,10,20,90},
				{100,10,20}
			};
		
				
		//배열에 저장된 형태 그대로 출력하기			
		for(int i=0; i<atom.length; i++) { //천천히 도는게 바깥쪽 for문 행. 행의 크기 : 배열의 길이 atom.length 배열명.length
			for(int j=0; j<atom[i].length; j++) { //빠르게 도는게 안쪽 for문 열. 열의 크기 열의 크기 : atom[0].length 행이름.length
				System.out.print(atom[i][j] + " \t ");
			}
			System.out.println();
		}
	}
}
