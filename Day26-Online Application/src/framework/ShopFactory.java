package framework;

public abstract class ShopFactory 
{
	public abstract PrimeAcc getNewPrimeAccount(int accNo, String accnm,float charges,boolean isPrime);
	public abstract NormalAcc getNewNormalAccount(int accNo, String accnm, float deliveryCharges, float charge);

}
