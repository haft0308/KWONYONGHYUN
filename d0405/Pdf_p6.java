package d0405;

public class Pdf_p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		result=pow(3);
		System.out.println("3x3=" + result);
		
	}
	
	//함수 정의
	static int pow(int a)
	{
		int b=1;
		for(int o=0; o<a; o++) {
			b *= a;
		}
		return b;
	}

}
