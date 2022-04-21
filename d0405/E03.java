package d0405;

public class E03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[] {2,3,4};

		prt(a);
		gop(a);
		hap(a);
		
	}
	
	static int gop(int[]a)
	{
		int hap=0;
		for(int i=0; i<a.length; i++) {
			hap *= a[i];
		}
		return hap;
	}
	
	static int hap(int[]a)
	{	int hap=0;
		for(int i=0; i<a.length; i++) {
			hap +=  a[i];
	
		}
		return hap;
	}
	
	static void prt(int[] a)
	{
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
