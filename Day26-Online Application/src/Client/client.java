package Client;

import application.GSNormalAcc;
import application.GSPrimeAcc;
import application.GSShopFactory;
import framework.NormalAcc;
import framework.PrimeAcc;
import framework.ShopFactory;

public class client {

	public static void main(String[] args) {
		ShopFactory obj=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(101,"Gagana",0.0f,true);
		NormalAcc n=new GSNormalAcc(102,"Raksh",50.0f,0.0f);
		System.out.println("Prime Account: ");
		p.bookProduct(350.0f);
		System.out.println();
		System.out.println("Normal Account: ");
		n.bookProduct(400.0f);
		
		System.out.println(p);
		System.out.println();
		System.out.println(n);
		

	}

}
