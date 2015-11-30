package Lesson3;

public class Billing {
	public float computeBill(float price)
	{
		return  (1.08f*price);
	}
	public float computeBill(float price,int quantity)
	{
		return (1.08f*price*quantity);
	}
	public float computeBill(float price,int quantity,float coupon)
	{
		return (1.08f*price*quantity*(1-coupon*0.01f));
	}


	public static void main(String[] args) {
		//private float ;
		Billing a = new Billing();
		System.out.printf("%.2f\n",a.computeBill(12));
		
	}

}
