package d0405;

public class Pdf_p12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] student = {"박진수", "장원우", "강한솔", "최진욱"};
		print(student);
		printJJang(student, "조장");
		printJJang(student, "짱!");
		
	}
	
	//1) 출력 함수를 정의하시오
	static void print(String[] a) {
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
	}
	//2) 출력 함수를 정의하시오
	// 박진수 조장
	// 장원우 조장
	// 강한솔 조장
	// 최진욱 조장
	//위와 같이 출력되도록 하시오
	static void printJJang(String[] a, String b) {
		System.out.println(a[0]+b);
		System.out.println(a[1]+b);
		System.out.println(a[2]+b);
		System.out.println(a[3]+b);
	}


	

}

