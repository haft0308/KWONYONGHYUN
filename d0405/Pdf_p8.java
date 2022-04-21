package d0405;

public class Pdf_p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] star = new int[10];
		
		
		System.out.println("----------------------");
		star(star, "\t");
		System.out.println();
		
		star = star(star);
		System.out.println("----------------------");
		star(star, "\t");
		
		System.out.println();
		
		star = star(star);
		System.out.println("----------------------");
		star(star, "\t");
		
		System.out.println();
		}//main
	
	static void star(int[] a, String b)
	{
		for(int i = 0; i < a.length; i++){
		System.out.print(a[i]+b);
		}		
	}
	static int[] star(int[]a,int b)
	{
		for(b = 0; b < a.length; b++){
		a[b]= b+1;
		}
		return a;		
	}
	static int[] star(int[]a)
	{
		for(int i = 0; i < a.length; i++){
		a[i]= i+1;
		}
		return a;		
	}
	

}
