package Lesson5;

import java.util.Scanner;

class DeptEmployee
{
	private String name;
	public float salary;
	private int hire_date;
	public float computeSalary()
	{
		return salary;
	}
	DeptEmployee(String name,float salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHire_date() {
		return hire_date;
	}
	public void setHire_date(int hire_date) {
		this.hire_date = hire_date;
	}
	
}
class Professor extends DeptEmployee
{
	Professor(String name, float salary) {
		super(name, salary);
	}

	private int numberOfPublications;

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
}
class Secretary extends DeptEmployee
{
	Secretary(String name, float salary) {
		super(name, salary);
	}
	private double overtimeHourss;
	public float computeSalary()
	{
		return (float) (salary+12*overtimeHourss);
	}
	public double getOvertimeHourss() {
		return overtimeHourss;
	}
	public void setOvertimeHourss(double overtimeHourss) {
		this.overtimeHourss = overtimeHourss;
	}
	
}
public class Q1 {
	
	
	public static void main(String[] args) {
		Professor Anna = new Professor("Anna",5000f);
		Professor Joy = new Professor("Joy",6000f);
		Professor Frank = new Professor("Frank",7000f);
		Secretary Tom = new Secretary("Tom",3000f);
		Secretary Jack = new Secretary("Jack",3500f);
		DeptEmployee[] department = new DeptEmployee[5];
		department[0]=Anna;
		department[1]=Joy;
		department[2]=Frank;
		department[3]=Tom;
		department[4]=Jack;
		System.out.println("to see the sum of all Professor salary, sum of all secretary salary and all salaries in the department?");
		Scanner a = new Scanner(System.in);
		if(a.next().equals("Y"))
		{
			float sumProfessor = 0,sumSecretary = 0;
			for(DeptEmployee d :department)
			{
				if(d instanceof Professor)
				{
					sumProfessor+=d.computeSalary();
				}else sumSecretary+=d.computeSalary();
			}System.out.println("Professor's all salary is :"+sumProfessor);
			System.out.println("Seretary's all salary is :"+sumSecretary);
		}
		
	}
}


