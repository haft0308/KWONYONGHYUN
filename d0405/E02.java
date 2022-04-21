package d0405;

public class E02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] ar1 = ran();
		int[][] ar2 = ran();
		
		prt(ar1);
		prt(ar2);
		prt(sum(ar1,ar2));
		prt(mul(ar1,ar2));
		
		
		
	}
	
	
	static int[][] ran()
	{
		int[][] a = new int[2][4];
		for(int o=0; o<a[1].length; o++) {
			for(int i=0; i<a.length; i++) {
				a[i][o]=(int) (Math.random()*10);
			}
		}	
		return a;
	}
	static int[][] sum(int[][] a,int[][]b)
	{
		int [][] sum = new int[2][4];
		for(int o=0; o<a[1].length; o++) {
			for(int i=0; i<a.length; i++) {
			sum[i][o]= a[i][o]+ b[i][o];}
		}
		return sum;
	}
	static int[][] mul(int[][] a,int[][]b)
	{
		int [][] sum= new int[2][4];
		for(int o=0; o<a[1].length; o++) {
			for(int i=0; i<a.length; i++) {
			sum[i][o]= a[i][o]* b[i][o];}
		}
		return sum;
	}
	static void prt(int[][] a)
	{
		for(int o=0; o<a.length; o++) {
			for(int i=0; i<a[1].length; i++) {
			System.out.print(a[o][i]+"\t");
			}
			System.out.println();
		}
		System.out.println("-".repeat(26));
	}
	
	
	

}
         