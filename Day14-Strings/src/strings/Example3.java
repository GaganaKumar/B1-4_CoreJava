package strings;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args)
	{
		String str="Bird";
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		if(str1.equals(str))
		{
			System.out.println("matching");
		}
		else {
			System.out.println("not matching");

		}
		s.close();

	}

}
