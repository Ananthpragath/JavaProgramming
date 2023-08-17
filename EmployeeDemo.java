import java.util.*;
abstract class EmployeeData
{
   int empid;
   String empname;
   double basicPay,PF,HRA,DA,LIC,grossPay,netPay;
   public abstract void getDetails();
   public abstract void calculateSal();
   public abstract void display();
}

class Employee extends EmployeeData
{
    String designation;
    Employee(int empid,String empname,String designation)
	{
	   this.empid=empid;
	   this.empname=empname;
	   this.designation=designation;
	}
	
	public void getDetails()
	{
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter basic salary :");
		basicPay=in.nextDouble();
		System.out.println("Enter the hra % :");
		HRA=in.nextDouble();
		System.out.println("Enter the da% :");
		DA=in.nextDouble();
		System.out.println("Enter the PF% :");
		PF=in.nextDouble();
		System.out.println("Enter the lic% :");
		LIC=in.nextDouble();
    }
	
	public void calculateSal()
	{
	   DA=basicPay*(DA/100);
	   HRA=basicPay*(HRA/100);
	   PF=basicPay*(PF/100);
	   LIC=basicPay*(LIC/100);
	   grossPay=basicPay+DA+HRA;
	   netPay=grossPay-(PF+LIC);
	}
	
	public void display()
	{
		System.out.println("Employee id :"+empid);
		System.out.println("Employee name :"+empname);
		System.out.println("Designation :"+designation);
		System.out.println("Basic Salary :"+basicPay);
		System.out.println("PF :"+PF);
		System.out.println("HRA :"+HRA);
		System.out.println("DA :"+DA);
		System.out.println("LIC :"+LIC);
		System.out.println("Gross salary :"+grossPay);
		System.out.println("Net Salary :"+netPay);
    }
}

class EmployeeDemo
{
	public static void main(String args[])
	{
		Employee e[]=new Employee[2];
		e[0]=new Employee(45,"Amirtha","Manager");
		e[1]=new Employee(97,"Carol","Scientist");
		for(int i=0;i<2;i++)
		{
			System.out.println("------------------------------------");
			e[i].getDetails();
			e[i].calculateSal();
			e[i].display();
			System.out.println();
		}
	}
}
		
		