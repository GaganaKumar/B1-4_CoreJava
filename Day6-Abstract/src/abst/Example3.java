package abst;
class Example11
{
	void display()
	{
		System.out.println("Hello Students");
	}
}

public class Example3 extends Example1
{
	void display()
	{
		
		System.out.println("Welcome to SpaceX");
	}

	public static void main(String[] args) 
	{
		Example3 e=new Example3();
		e.display();

	}

}
