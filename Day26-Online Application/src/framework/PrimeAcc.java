package framework;

public abstract class PrimeAcc extends ShopAcc
{
	private static boolean isPrime;
	private static final float deliveryCharges=0.0f;
	
	
	
	public PrimeAcc(int accNo, String accnm,float charges,boolean isPrime) 
	{
		super(accNo,accnm,charges);
		//this.isPrime = isPrime;
		PrimeAcc.isPrime=isPrime;
	}



	public static boolean getisPrime() {
		return isPrime;
	}



	public static float getDeliverycharges() {
		return deliveryCharges;
	}
	

}
