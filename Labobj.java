class Dil
{
String name;
Dil(String d)
{
	name=d;
	System.out.println("Name");
}
public String toString() 
{
	return name;
}
}
public class Labobj {

	public static void main(String[] args) 
	{
		Dil d1=new Dil("dileep");
		Dil d2=d1;
		System.out.println(d1.equals(d2));
		System.out.println(d1.hashCode());
		System.out.println(d1.toString());
		System.out.println(d1.getClass());
		System.out.println(d2==d1);
	}
}
