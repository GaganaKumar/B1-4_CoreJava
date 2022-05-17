package application;

import framework.NormalAcc;
import framework.PrimeAcc;
import framework.ShopFactory;

public class GSShopFactory extends ShopFactory
{                                    
	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accnm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accnm, float deliveryCharges, float charge) {
		// TODO Auto-generated method stub
		return null;
	}
}
