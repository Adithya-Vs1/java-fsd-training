import java.util.*;
public class DuplicateChara_Prg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String string1 = "";
		string1 = sc.nextLine();
		       int count;  
		       char string[] = string1.toCharArray();  
		       System.out.println("Duplicate chara from the entered String: ");  
		       
		       for(int i = 0; i <string.length; i++) {  
		           count = 1;  
		           for(int j = i+1; j <string.length; j++) {  
		               if(string[i] == string[j] && string[i] != ' ') {  
		                   count++;  
		                     
		                   string[j] = '0';  
		               }  
		           }  
		           
		           if(count > 1 && string[i] != '0')  
		               System.out.println(string[i]);  
		       }  
	}
}
	
