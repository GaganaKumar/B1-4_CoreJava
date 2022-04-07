package abst;
class A
{
	String name="Gagana";
}
class B extends A
{
	String name="Kumar";
	void print()
	{
		System.out.println("Hey i am "+name);
		System.out.println("Hai i am "+super.name);
	}
}

public class Example4 {

	public static void main(String[] args) 
	{
		{
			B b=new B();
			b.print();
		}

	}

}
