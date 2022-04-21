package d0405;

public class E05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(res2());
		
	}

	
	static int rando() 
	{
		return (int) (Math.random()*9+1);
	}
	
	static int res2()
	{
		int[] knew = new int[3]; //생성
		for(int i=0; i<knew.length; i++) { 
			knew[i]=rando();
		}
		
//		for(int i=0; i<knew.length; i++) {
//		for(int j=i+1; j<knew.length; j++) {
//			if(knew[i]==knew[j]) {
//				knew[j]=rando();
//				j--;
//				continue;
//			}
//		}
//	}
		
		for(int i=1; i<knew.length; i++) { //반복체크
			for(int r=0; r<i; r++) {
				if(knew[i]==knew[r]) {
					knew[i]=rando();
					r=-1;
				}
			}
		}
		
		
		int res = 0; //숫자로 만들기
		for(int i= 0; i<knew.length; i++) {
			for(int j=i+1; j<knew.length; j++) {
				knew[i]= knew[i]*10;
			}
			res += knew[i];
		}
		return res;
		
	}
	
	
	
//	static int res()
//	{
//		int a,b,c;
//		a=b=c=0;				
//		while(a==b || b==c || c==a) {
//			a=rando();
//			b=rando();
//			c=rando();
//		}
//		for(a= a+a-a ; a==b; )
//		c= 100*a+ 10*b+ c;
//		return c;
//	}

	
	
}