package d0421;

public class ProductM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buyer b = new Buyer(); //Buyer 인스턴스 생성
		Product[] p = new Product[3]; // Product 배열 초기화
		// [] p에 할당
		p[0] = new TV();  //업캐스팅
		p[1] = new Com();
		p[2] = new Audio();
		
		for (Product i : p) { // p 전부를 순회
			b.buy(i); // 순서대로 p구매
		}
		b.prt(); // 출력
		((TV) p[0]).volumn=5;
		Product p2 = new Com();
		
		
		Com c10 = (Com) p2;
		System.out.println(c10.cpu);
		System.out.println(c10.ram);
		
		Buyer b2 = new Buyer();
		TV tv = new TV();		
		b2.buy(tv);
		b2.buy(tv);
		b2.buy(p[1]);
		b2.buy(p[2]);
		
	}

}

class Product 
{
	int price;
	int bonus;
}
//상속
class TV extends Product 
{
	int chan;
	int volumn;
	TV() // 생성자
	{
		price=100;
		bonus=100;
	}
}
//상속
class Com extends Product
{
	int cpu;
	int ram;
	Com() // 생성자
	{
		price=200;
		bonus=200;
	}
}
//상속
class Audio extends Product
{
	int volumn;
	int speaker;
	Audio() // 생성자
	{
		price=50;
		bonus=50;
	}
}
class Buyer
{
	int money=10000;
	int bonus=0;
	void buy(Product p) //p클래스를 받아서 변수에 적용 
	{
		money -= p.price; // 돈을 p의 돈만큼 뺌
		bonus += p.bonus; // 보너스를 p.bonus만큼 더함
		prt();
	}
	void prt() // 변수출력
	{
		System.out.println("money = "+money);
		System.out.println("bonus = "+bonus);
	}
}