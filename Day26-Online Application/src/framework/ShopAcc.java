package framework;

public abstract class ShopAcc 
{
	private static int accNo;
	private static String accnm;
	private static float charges;
	
	public ShopAcc(int accNo, String accnm, float charges) 
	{
		ShopAcc.accNo = accNo;
		ShopAcc.accnm = accnm;
		ShopAcc.charges = charges;
	}
	public abstract void bookProduct(float charges);
    public abstract void items(float charges);
	public static int getAccNo() {
		return accNo;
	}
	public static String getAccnm() {
		return accnm;
	}
	public static void setAccnm(String accnm) {
		ShopAcc.accnm = accnm;
	}
	public static float getCharges() {
		return charges;
	}
	public static float getCharge() {
		return charges;
	}
	
	@Override
	public String toString() {
		return "ShopAcc[accNo="+accNo+", accnm="+accnm+", charges="+charges+"]";
	}
	
	
	
}
    
