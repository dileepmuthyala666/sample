public class Bank {

	public static void main(String[] args) {
		int b,d,t,i,it,tb ,bal;
		System.out.println(" HDFC Bank Balance");
		b=25000;
		d=15000;
		t=11000;
		bal=(b+d)-t;
		i=bal*2/100;
		it=i*12;
		tb=bal+it;
		System.out.println(" Balance ="+tb);
	}
}
