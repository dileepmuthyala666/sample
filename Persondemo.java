class Person
{
	int pid;
	String pname;
	Person()
	{
		pid=1;
		pname="Dileep";
	}
}
class Student extends Person
{
int marks;	
Student()
{
  marks=75;
}
void show()
{
  System.out.println(pid+" "+pname+" "+marks);
}
}
class Emp extends Person
{
int salary;
Emp()
{
salary=27000;
}
void show()
{
	System.out.println(pid+" "+pname+" "+salary+" ");
}
}
	class Persondemo 
	{
		public static void main (String[] args)
		{
		Student s=new Student();
		Emp e=new Emp();
		s.show();
		e.show();
		}
	}

