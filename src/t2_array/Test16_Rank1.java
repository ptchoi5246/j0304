package t2_array;
//전체 비교
public class Test16_Rank1 {
	public static void main(String[] args) { //2중 for문
		int[] su = {90,70,100,90,60};
		int rank[] = new int[su.length];//int su의 갯수에 따라 다르다
		
		//순위 구하기
		for(int i=1; i<=su.length; i++) {
			rank[i-1] = 1;
			for(int j=1; j<=su.length; j++) {
				if(su[i-1] < su[j-1]) rank[i-1]++;
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
