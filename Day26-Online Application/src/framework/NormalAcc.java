package framework;

public abstract class NormalAcc extends ShopAcc
{
	private static float deliveryCharge;
	

	public NormalAcc(int accNo, String accnm, float deliveryCharges, float charge) {
		
		super(accNo,accnm,charge);
		NormalAcc.deliveryCharge=deliveryCharges;
	
	}


	public static float getDeliveryCharge() {
		return deliveryCharge;
	}
	public String toString() {
		return "NormalAcc[getCharges()="+getCharges()+"getDeliveryCharges"+getDeliveryCharge()+",toString()="+super.toString()+"]";
	}

}
