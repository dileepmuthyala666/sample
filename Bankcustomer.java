class Banks
{

	int acno;
  String atype;
   int amt;
    Banks()
  { 
    	acno=630564728;
        atype="Salary";
        amt=24000;
   }
    Banks(int a,String b,int c)
    {
    	acno=a;
    	atype=b;
    	amt=c;
    }

    void show()
    {
    	System.out.println(acno+" "+atype+" "+amt);
    }

}
public class Bankcustomer{
	public static void main (String[] args)
	{
	Banks b=new Banks();
	Banks b1=new Banks(56342,"savings",10000);
	b1.show();
	b.show();
	
	}
}
