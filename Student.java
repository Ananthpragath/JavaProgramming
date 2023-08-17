import java.util.*;
abstract public class University
{
    public String uni_name;
	public String departments[];
	public int maxstu[];
}

public class SoC extends University
{
    public SoC(String uni_name)
	{
		this.uni_name=uni_name;
		departments[]={"CSE","IT","ICT"};
		maxstu[]={25,30,35};
	}
	public void display()
	{
		System.out.println("University name :"+uni_name);
		int i=0;
		while(departments[i]!=null)
		{
			System.out.println(departments[i]);
		    System.out.println(maxstu[i]);
			i++;
		}
	}
}

public class SEEE extends University
{
	SEEE(String uni_name)
	{
		this.uni_name=uni_name;
	    departments={"ECE","EEE","EIE"};
		maxstu={20,35,40};
	}
	void display()
	{
		System.out.println("University name :"+uni_name);
		int i=0;
		while(departments[i]!=null)
		{
			System.out.println(departments[i]);
		    System.out.println(maxstu[i]);
			i++;
		}
	}
	
}

class Student
{
	int stuid;
	String sname;
	double percentage;
	University admittedSchool;
	Student(int stuid,String name,double percentage)
	{
		this.stuid=stuid;
		this.name=name;
		this.percentage=percentage;
	}
	public static void main(String args[])
	{
		Student s[]=new student[10];
		SoC ob1=new SoC("sastra university");
	    SEEE ob2=new SEEE("sastra university");
		ob1.display();ob2.display();
		Scanner in =new Scanner(System.in);
        System.out.println("Enter no. of students:");
        int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter student id :");
			int id=in.nextInt();
			System.out.println("Enter student name :");
			in.nextLine();
			String name=in.nextLine();
			System.out.println("Enter percentage :");
			double p=in.nextDouble();
			s[i]=new Student(id,name,p);
			p=p/100;
			if(p>9.0)
			{
				Student[i].admittedSchool="CSE-SoC";
			    ob1.maxstu[0]--;

			}
			else if(p>8.5)
			{
				Student[i].admittedSchool="IT-SoC";
			    ob1.maxstu[1]--;
			}
			else if(p>8.0)
			{
				Student[i].admittedSchool="ECE-SEEE";
			    ob2.maxstu[0]--;
			}
			else if(p>7.5)
			{
				Student[i].admittedSchool="ICT-SoC";
			    ob1.maxstu[2]--;
			}
			else if(p>7.0)
			{
				Student[i].admittedSchool="EEE-SEEE";
			    ob2.maxstu[1]--;
			}
			else if(p>6.5)
			{
				Student[i].admittedSchool="EIE-SEEE";
			    ob2.maxstu[2]--;
			}
			
		
		