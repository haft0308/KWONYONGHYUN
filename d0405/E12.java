package d0405;

import java.util.Scanner;

public class E12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int[][] a= new int [10][3];
		a = knew(a); //랜덤 리스트 새로 설정
		for(int i=0; i<10; i++) { //프린트
			for(int o=0; o<3; o++) {
				System.out.print(a[i][o]+" ");
			}
			System.out.println();
		}
		
		System.out.print("타입: ");
		prt(a, sc.next()); //보고싶은 값 입력하면 출력
		
	}
	
	
	static int[][] knew(int[][] a){
		for(int i=0; i<10; i++) {
			a[i][0]= (int) (Math.random()*125+25);
			a[i][1]= (int) (Math.random()*100+120);
			a[i][2]= (int) (Math.random()*100+200);
		}
		return a;
	}
	
	static void prt(int[][] a, String b) { 
		
		for(int i=0; i<3; i++) { // i = 몸,키,발
			int max=0;
			for(int o=0; o<10; o++) {
				if (max<a[o][i]) {
					max = a[o][i];
				}

			}

			switch(b) {
			case "w" : System.out.print("몸="+max); return;
			case "h" : 
				if(i==1) {
				System.out.print("키="+max); return; }
				break;
			case "s" : 
				if(i==2) {
				System.out.print("발="+max); return;}
				break;
			case "a" : //전부
				switch(i) {
				case 0: System.out.print("몸"+max); break;
				case 1: System.out.print(" 키"+max); break;
				case 2: System.out.print(" 발"+max); break;
				}
				break;
			default : System.out.println("오입력"); return;

			}
			
		}
	}

}
