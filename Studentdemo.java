class Stu
{
	int sid;
	String sname;
	int marks;
	void input(int x,String y,int z)
	{
		sid=x;
		sname=y;
		marks=z;
	}
	void output()
	{
		System.out.println(sid+" "+sname+" "+marks);
	}
	} 

public class Studentdemo {
public static void main(String[] args) {
		Stu s1=new Stu();
		s1.input(1,"naga",450);
		s1.output();

	}
}
