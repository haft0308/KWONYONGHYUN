package d0405;

public class Pdf_p11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[3];
		for ( int i = 0; i < 3; i++)
		{
			array[i] = i+1;
		}
		//array값을 변경하는 함수를 호출하라.
		changeArray(array);
		//배열의 값을 출력해주는 함수를 호출하시오.
		
	}//main
	//array값을 변경하는 함수
	static void changeArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = arr[i] + 2;
		}
		//배열의 값을 출력해주는 함수 호출하시오
	}
	//배열의 값을 출력해주는 함수 정의.
}



