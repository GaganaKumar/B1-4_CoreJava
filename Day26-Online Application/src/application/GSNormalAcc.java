package application;

import framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accnm, float deliveryCharges, float charge) {
		super(accNo, accnm, deliveryCharges, charge);
		
	}

	@Override
	public void bookProduct(float charges) {
		float charges1=charges+NormalAcc.getDeliveryCharge();
		System.out.println("Account No"+NormalAcc.getAccNo()+"\n"+"Account Name"+NormalAcc.getAccnm()+"\n"+"Charges"+NormalAcc.getCharges()+"\n"+"Delivery Charges"+NormalAcc.getDeliveryCharge());
		
		
	}

	@Override
	public void items(float item_id) {
		System.out.println();
		
		
	}
	@Override
	public String toString() {
		return "GSNormalAcc[toString()="+super.toString()+",getCharges()="+getCharges()+"]";
	}

}
