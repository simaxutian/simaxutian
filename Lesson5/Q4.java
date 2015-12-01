package Lesson5;

import java.util.Scanner;

interface Employee 
{
	int base_salary=10;
	int bonus=2;
	int extra_hours=15;
	employeeInformation getEmpolyeeDetails();
	double calculateSalary();
	String employeeInformation();
}
class employeeInformation{
	private String Employeename;
	private int Employee_id;
	private int ssn;
	private int BirthDate;
	private String Address;
	public String getEmployeename() {
		return Employeename;
	}
	public void setEmployeename(String employeename) {
		Employeename = employeename;
	}
	public int getEmployee_id() {
		return Employee_id;
	}
	public void setEmployee_id(int employee_id) {
		Employee_id = employee_id;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public int getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(int birthDate) {
		BirthDate = birthDate;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
class Secretary2 implements Employee
{
	private int monthhour;
	private int workyears;
	private double salary;
	private employeeInformation EmployeeInformation;
	public Secretary2(int monthhour, int workyears) {

		this.monthhour = monthhour;
		this.workyears = workyears;
	}

	public int getMonthhour() {
		return monthhour;
	}

	public void setMonthhour(int monthhour) {
		this.monthhour = monthhour;
	}

	public int getWorkyears() {
		return workyears;
	}

	public void setWorkyears(int workyears) {
		this.workyears = workyears;
	}

	@Override
	public employeeInformation getEmpolyeeDetails() {
		// TODO Auto-generated method stub
		return EmployeeInformation;
	}

	@Override
	public double calculateSalary() {
		
		if(monthhour>150)
		{
			salary=(monthhour-150)*2+base_salary*monthhour;
		}
		else salary=base_salary*monthhour;
		
		if(workyears>5)
		{
			salary=1.1*base_salary*monthhour;
		}
		return salary;
	}

	@Override
	public String employeeInformation() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class Manager implements Employee
{
	private int monthhour;
	private double salary;
	//private int extra_hour;
	private employeeInformation ManagerInformation;
	public Manager(int monthhour) {
		this.monthhour = monthhour;
		this.salary = salary;
		//this.extra_hour = extra_hour;
	}

	public int getMonthhour() {
		return monthhour;
	}

	public void setMonthhour(int monthhour) {
		this.monthhour = monthhour;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public employeeInformation getEmpolyeeDetails() {
		return ManagerInformation;
	}

	@Override
	public double calculateSalary() {
		if(monthhour>150)
		{
			salary=(150-monthhour)*extra_hours+base_salary*monthhour*2;
		}else salary=base_salary*monthhour*2;
		return salary;
	}

	@Override
	public String employeeInformation() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
public class Q4 {

	public static void main(String[] args) {
		employeeInformation e = new employeeInformation();
		//Secretary2 Jack = new Secretary2();
		
		System.out.println(" manager please input 1 else input 2 ");
		Scanner s = new Scanner(System.in);
		e.setEmployeename(s.next());
		if(s.nextInt() ==1)
		{
			System.out.println("what is his name: ");
			Scanner n = new Scanner(System.in);
			String name  =n.next();
			System.out.println("how long does he work for a month: ");
			int hour = new Scanner(System.in);
			Tom.setMonthhour(hour.nextInt());
			System.out.println("Manager's salary is : "+Tom.calculateSalary());
			Manager Tom = new Manager(hour); 
		}
		if(s.nextInt()==2)
		{
			System.out.println("how long does he work for a month: ");
			Scanner h = new Scanner(System.in);
			Jack.setMonthhour(h.nextInt());
			System.out.println("How many years did he worked : ");
			Scanner nian = new Scanner(System.in);
			Jack.setWorkyears(nian.nextInt());
			System.out.println("his salary is : "+Jack.calculateSalary());
		}

	}

}
