package d0405;

public class E11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {2,1,4,7,8,3};
		prt(a,'#');
		
	}
	
	
	static void prt(int[] a,char b){
		for(int o=0; o<a.length; o++) {
			for(int i=0; i<a[o]; i++) {
				System.out.print(b);
			}
			System.out.println();
		}
		
	}

}
