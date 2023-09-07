class Labstbb
{
	public static void main(String[] args)
	{
		StringBuffer s1=new StringBuffer("Dileep");
		StringBuilder s2=new StringBuilder("Kumar");
		System.out.println(s1.reverse());
		System.out.println(s1.delete(0,4));
		System.out.println(s1.append("Muthyala"));
		System.out.println(s1.insert(0,"sai"));
		System.out.println(s1.length());
		//StringBuffer
		System.out.println("*/StringBuilder/*");
		System.out.println(s2.append("Muthyala"));
		System.out.println(s2.length());
		System.out.println(s2.reverse());
		
	}
}