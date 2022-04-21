package d0405;

import java.util.Scanner;

public class E13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		

		System.out.println("반지름:");
		a=sc.nextInt();
		System.out.println("높:");
		b=sc.nextInt();
		System.out.println(vol(a,b));
	
		
	}

	static float vol(int a, int b) {
		
		return (float) (Math.round(a*a*b*Math.PI*10)/10.0);
	}
	
	
	
}
