public class Alloperators {

	public static void main(String[] args) {
		int x=10, y=20, z=5,a=5, b=15,c=25;
		double m1,m2,m3=50;
		System.out.println("All Operators Are Used ");
		String result;
		//Arithematic operator
		System.out.println(" *Arithematic Operator ");
		m1=x+y;//m1=10+20=30 it m1 value
		y=x+z;//y=10+5=15  it y value
		z=x-y;//z=10-15=-5 it z value
		x=y-z;//x=15-5 =10
		m2=m1*m3;//m2=30*50=1500
		m3=m2/m1;//m3=1500/30
		System.out.println("Enter all value == "+ m1); 
		System.out.println("Enter all value == "+ y);
		System.out.println("Enter all value == "+ z);
		System.out.println("Enter all value == "+ x);
		System.out.println("Enter all value == "+ m2);
		System.out.println("Enter all value == "+ m3);
		
		
		//bitwise operator
		
		System.out.println(" *Bitwise Operator");
		System.out.println(x&y);
		System.out.println(x^y);
		System.out.println(x<<y);
		System.out.println(x>>y);
		
		
		//relational operator
		
		System.out.println("  *Relational Operator");
		System.out.println(x>y);
		System.out.println(x<y);
		System.out.println(x==y);
		System.out.println(x!=y);
		
		
		
         //ternary operator
		
		System.out.println("  *Ternary Operator ");
		result=(m1<1500  && m2>50 && m3>20)? "pass."  :"fail.";
		System.out.println("Show Result == "+ result);
		
		
		
		//unary operator
		
		System.out.println(" *Unary Operator");
		b=++a;
		c=b++ + ++a;
		System.out.println("Enter b value == "+b);
		System.out.println("Enter c value == "+c);
		
		
	}

}
