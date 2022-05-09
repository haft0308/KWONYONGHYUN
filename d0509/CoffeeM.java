package d0509;
import java.util.*;
public class CoffeeM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manage m = new Manage();
		m.process();
	}

}
class Manage
{
	ArrayList<Coffee> al = new ArrayList<>();
	int idx;
	boolean B = true;
	static Scanner sc = new Scanner(System.in);
	
	void process()
	{
		while(B)
		{
			System.out.println("0. 검색 1. 추가 2. 수정 3. 삭제 4. 초기화 5. 보기 6. 종료");
			switch(sc.nextInt()) {
			case 0:
				find();
				break;
			case 1:
				add();
				break;
			case 2:
				fix();
				break;
			case 3:
				del();
				break;
			case 4:
				Del();
				break;
			case 5:
				prt();
				break;
			case 6:
				B=false;
				System.out.println("끝");
				break;
			}
			
		}
	}
	int find()
	{
		
		System.out.println("찾을 이름:");
		String name = sc.next();
		idx = -1;
		for(int i=0; i<al.size(); i++)
		{
			if(al.get(i).getName().equals(name))
			{
				idx = i;
				break;
			}
		}
		if(idx<0) {
			System.out.println("없음");
		}
		return idx;
	}
	void add()
	{
		System.out.println("이름");
		String a= sc.next();
		System.out.println("브랜드");
		String b= sc.next();
		System.out.println("가격");
		int c= sc.nextInt();
		al.add(new Coffee(a,b,c));
	}
	void fix()
	{
		Coffee c = al.get(find());
		System.out.println("바꿀이름");
		c.setName(sc.next());
	}
	void del()
	{
		al.remove(find());
	}
	void Del()
	{
		al.removeAll(al);
	}
	void prt()
	{
		Iterator<Coffee> it = al.iterator();
		if(!it.hasNext())
			System.out.println("없음");
		while(it.hasNext())
			System.out.println(it.next());
	}
	
	
}

class Coffee
{
	private String name;
	private String brand;
	private int price;
	Coffee(String a,String b, int c)
	{
		name = a;
		brand = b;
		price = c;
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getBrand() {
		return brand;
	}
	int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+","+brand+","+price;
	}
	
	
}