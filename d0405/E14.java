package d0405;

import java.util.Scanner;

public class E14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		int j= 10; //남은좌석
		
		while(j>= 0) {
			vew(a,-9); // 보기
			System.out.print("선택 :");
			int b = sc.nextInt(); // 좌석번호입력
			if(b==-1) {
				System.out.println("끝");
				break;
			}else if(a[b-1]==1) { 
				System.out.println("이미");
				continue;
			}
			a[b-1]= tic(a, b); // 예매 // a[b]이므로 좌석은 b-1
			vew(a,b);
			System.out.print(b+" 확실? (y,n)\n");
			a[b-1]= sc.next().equals("y")? 1 : 0; //확인, y아니면 0으로
			j--;
			if(j==0) {
				System.out.println("끝");
				break;
			}
		}
	}//main

	static void vew(int[] a,int b) 
		{
		for(int i=1; i<11; i++) {
			System.out.print(i+"번\t");
		}
		System.out.println();
		for(int i=0; i<10; i++) { //입력한b 따로 표시
			if(i==b-1) {		// a[b]이므로 좌석은 b-1
				System.out.print("■"+"\t"); 
				continue;
			}
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		}
	
	static int tic(int[] a, int b)
	{		
		return a[b-1]=1; 
	}	
}
