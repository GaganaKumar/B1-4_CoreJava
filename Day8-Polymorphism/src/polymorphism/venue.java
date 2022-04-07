package polymorphism;

public class venue {
	String color;
	int speed;
	venue()
	{
		System.out.println("I bought venue in 2022");
	}
	venue(String color, int speed)
	{
		this.color=color;
		this.speed=speed;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		venue r = new venue();
		venue r1 = new venue("White",50);
		System.out.println(r1.color+" "+r1.speed);
	}

}


