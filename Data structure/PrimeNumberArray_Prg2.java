import java.util.*;
public class PrimeNumberArray_Prg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc =new Scanner(System.in);
		  System.out.println("Enter the input no : ");
		  int n=sc.nextInt();
		  int count;
		  int len=0;
		  int[] arr = new int[n];
		  for(int i=2;i<=n;i++)
		  {
		   count =0;
		   for(int j=2;j<=i/2;j++)
		    
		    {
		     if(i%j ==0)
		     {
		      count++;
		      break;
		     }
		    }
		   if(count==0)
		   {
		    arr[len]=i;
		    len++;
		    
		   }
		  
		 }
		  System.out.println("The primenumbers from the input no:");
		  for(int x=0;x<len;x++)
		  {
		   System.out.println(arr[x]+" ");
		  }
		  sc.close();

		}
		}
