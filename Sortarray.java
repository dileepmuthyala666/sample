public class Sortarray {

	public  static void main(String[] args) {
        int[] sorte = {10, 12, 14, 15, 13, 11};
        int[] a = new int[6];
        System.out.println("Given sort array:");
        for (int i=0; i<6; i++)
        {
            a[i]=sorte[i];
            System.out.print( " "+a[i]);
        }
       
        for (int i=0; i<6-1; i++) 
        {
            for (int j=0; j<6-i-1; j++) 
            {
                if (a[j]>a[j+1]) 
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        
        System.out.println(" Sorted array:");
        for (int i=0; i<6;i++)
        { 
       	 System.out.print( " "+a[i]);
            }
          
            }
	}

