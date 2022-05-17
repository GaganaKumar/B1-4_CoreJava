package application;

import framework.PrimeAcc;
import framework.ShopAcc;

public class GSPrimeAcc extends PrimeAcc
{
	private static float charges;
	public GSPrimeAcc(int accNo, String accnm, float charges, boolean isPrime) {
		super(accNo, accnm, charges, isPrime);
		GSPrimeAcc.charges=charges;
	}
	@Override
	public void bookProduct(float charges) {
		System.out.println("Account No"+ShopAcc.getAccNo()+"\n"+"Account Name"+ShopAcc.getAccnm()+"\n"+"Charges"+ShopAcc.getCharges()+"\n"+"Delivery Charges"+PrimeAcc.getDeliverycharges());
				
	}
	
	public static float getCharges() {
		return GSPrimeAcc.charges;
	}
	@Override
    public void items(float item_id) {
		
		
	}
	@Override
	public String toString() {
		return "GSPrimeAcc[toString()="+super.toString()+",getCharges()="+getCharges()+"]";
	}
	
	
		
	}
	
   
	
		
		


