package recursion;

import java.util.Scanner;

public class fibbonacci {
	static int fibbonacci(int n) {
		{
			if(n==0 || n==1) {
				return n;
				}
			else
			{
				return fibbonacci(n-2)+fibbonacci(n-1);
			}
			}  
			}
			public static void main(String[] args) {
				fibbonacci obj = new fibbonacci();
				Scanner s = new Scanner(System.in);
				int x=s.nextInt();
				for(int i=0;i<x;i++)
				System.out.print(obj.fibbonacci(i)+",");
				s.close();
			}
}
