package Lesson3;

public class SavingsAccount {
	private static double annualInterestRate;
	private  double savingsBalance;
	
	public void calculateMonthlyInterest()
	{
		savingsBalance+= this.savingsBalance*(annualInterestRate/12);
	}
	public static void modifyInterestRate(double aa)
	{
		annualInterestRate=aa;
		
	}
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}
	public  double getSavingsBalance() {
		return savingsBalance;
	}
	public  void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		saver1.setSavingsBalance(2000);
		saver2.setSavingsBalance(3000);
		SavingsAccount.setAnnualInterestRate(0.04);
		for(int i=1;i<13;i++)
		{
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			System.out.printf("saver1's balance for month %d is : %.2f\n ",i,saver1.getSavingsBalance());
			System.out.printf("saver2's balance for month %d is : %.2f\n ",i,saver2.getSavingsBalance());
		}
		SavingsAccount.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.printf("saver1's balance is : %.2f\n ",saver1.getSavingsBalance());
		System.out.printf("saver2's balance is : %.2f\n ",saver2.getSavingsBalance());

	}

}
