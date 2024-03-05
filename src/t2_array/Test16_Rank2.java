package t2_array;
//전체 비교 //데이터가 많을 때 이 방법으로 
public class Test16_Rank2 {
	public static void main(String[] args) { //2중 for문
		int[] su = {90,70,100,90,60};
		int rank[] = new int[su.length];//int su의 갯수에 따라 다르다
		
		//순위의 초기값(1) 부여하기
		for(int i=0; i<su.length; i++) {
			rank[i] = 1;
		}
		
		//순위 구하기
		for(int i=1; i<=su.length; i++) {
			for(int j=i+1; j<=su.length; j++) { //나하고 나 앞의 것과 비교 //진격 Selection Sort
				if(su[i-1] < su[j-1]) rank[i-1]++; //
				else if(su[i-1] > su[j-1]) rank[j-1]++;
			}
		}
		
		//출력
		System.out.println("점수\t순위");
		System.out.println("===============================");
		for(int i=0; i< su.length; i++) {
			System.out.println(su[i] + "\t" + rank[i]);
		}
	}
}
