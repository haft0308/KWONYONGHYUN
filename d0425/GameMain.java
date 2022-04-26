package d0425;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		Runner person = null;
		Act pg = null;
		System.out.println("선택하세요. \n1.김씨 2.이씨 3.박씨" );
		int x = sc.nextInt();
		
		switch (x)
		{
		case 1:
			person = new Kim();
			break;
		case 2:
			person = new Lee();
			break;
		case 3:
			person = new Park();
			break;
		default:
			System.out.println("잘못 눌렀습니다");
		}
		
		if(person == null)
		{
			System.out.println("end");
			return;
		}
		else
		{ pg = new Act(person); }
		
		while ( true )
		{
			pg.printMenu(sc);
			if ( pg.isExit() )
			{
				System.out.println("죽었습니다");
				break;
			}
		}
	}

}


abstract class Runner
{
	protected int distance;
	protected int km = 0;
	protected int energy;
	
	public abstract void drink();
	public abstract void rest();
	public abstract boolean walk();
	public abstract boolean run();
	public abstract void kmup();
	public boolean checkEnergy()
	{
		boolean ret = false;
		if (energy <= 0)
		{
			ret = true;
		}
		return ret;
	}
	public void prtInfo()
	{
		System.out.println("거리 ="+distance);
		System.out.println("에너지 ="+energy);
		System.out.println(km+" km");
	}
}


class Act
{
	private Runner person;
	private int menu;
	private boolean exit;
	
	public Act(Runner person)
	{
		this.person = person;
	}
	public void printMenu(Scanner sc)
	{
		System.out.println("1.마시기 2.쉬기 3.걷기 4.뛰기 5.종료 ");
		menu = sc.nextInt();
		act();
	}
	public void act()
	{
		switch(menu)
		{
		case 1:
			person.drink();
			break;
		case 2:
			person.rest();
			break;
		case 3:
			exit = person.walk();
			break;
		case 4:
			exit = person.run();
			break;
		case 5:
			exit = true;
			break;
			
		}
		person.prtInfo();
	}
	public Runner getRunner()
	{
		return person;		
	}
	public void setRunner(Runner person)
	{
		this.person = person;
	}
	public int getMenu()
	{
		return menu;
	}
	public void setMenu(int menu)
	{
		this.menu = menu;
	}
	public boolean isExit()
	{
		return exit;
	}
	public void setExit(boolean exit)
	{
		this.exit = exit;
	}
}


class Kim extends Runner
{
	Kim()
	{
		distance=40;
		energy=50;
		System.out.println("김씨를 골랐습니다");
		prtInfo();
	}
	public void drink()
	{
		energy += 15;
	}
	public void rest()
	{
		energy += 10;
	}
	public boolean walk()
	{
		energy -= 20;
		distance += 20;
		kmup();
		return checkEnergy();				
	}
	public boolean run()
	{
		energy -= 40;
		distance += 35;
		kmup();
		return checkEnergy();
	}
	public void kmup()
	{
		if (distance >= 1000)
		{
			km++;
			distance -= 1000;
		}
	}
}

class Lee extends Runner
{
	Lee()
	{
		distance=20;
		energy=30;
		System.out.println("이씨를 골랐습니다");
		prtInfo();
	}
	public void drink()
	{
		energy += 15;
	}
	public void rest()
	{
		energy += 10;
	}
	public boolean walk()
	{
		energy -= 20;
		distance += 20;
		kmup();
		return checkEnergy();				
	}
	public boolean run()
	{
		energy -= 40;
		distance += 35;
		kmup();
		return checkEnergy();
	}
	public void kmup()
	{
		if (distance >= 1000)
		{
			km++;
			distance -= 1000;
		}
	}
}

class Park extends Runner
{
	Park()
	{
		distance=40;
		energy=50;
		System.out.println("박씨를 골랐습니다");
		prtInfo();
	}
	public void drink()
	{
		energy += 15;
	}
	public void rest()
	{
		energy += 10;
	}
	public boolean walk()
	{
		energy -= 20;
		distance += 20;
		kmup();
		return checkEnergy();				
	}
	public boolean run()
	{
		energy -= 40;
		distance += 35;
		kmup();
		return checkEnergy();
	}
	public void kmup()
	{
		if (distance >= 1000)
		{
			km++;
			distance -= 1000;
		}
	}
}


