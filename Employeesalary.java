import java.util.Scanner;
public class Employeesalary {

	public static void main(String[] args) {
		int salary; 
		double da,hra,pf,gross;
		System.out.println("Employee salary");
              Scanner sc =new Scanner(System.in);
           salary =sc.nextInt();
           da=salary*12/100;
           hra=salary*13/100;
           pf=salary*15/100;
           
  System.out.println("Employee salary with da+hra+pf");
           gross= salary+da+hra+pf;
          System.out.println("  employee salary==" +salary+"   employee da==" +da+  "  employee hra==" +hra+"   employee pf==" +pf);   
          System.out.println(" Total salary=  "+gross);
          
          
	gross=salary+da+hra-pf;
	System.out.println("Only salary without pf =  " +gross);
	}
	
}