
		class GrandFather  
		{  
		public void show()  
		{  
		System.out.println("I am grandfather.");  
		}  
		}  

		class Father extends GrandFather  
		{  
		public void show()  
		{  
		System.out.println("I am father.");  
		}  
		}  

		class Son extends Father  
		{  
		public void show()  
		{  
		System.out.println("I am son.");  
		}  
		}  

		public class HybridInheritance_Prg14 extends Father  
		{  
		public void show()  
		{  
		System.out.println("I am a daughter.");  
		}  
		public static void main(String args[])  
		{  
		HybridInheritance_Prg14 obj = new HybridInheritance_Prg14();  
		obj.show();  
		}  
		}