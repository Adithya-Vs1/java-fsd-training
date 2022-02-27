import java.util.*;
public class MethodOverRiding_Prg13 {

	public static void main(String[] args) {

				   Dog a =new Dog();
				   a.eat();
				   a.sleep();
				  }
				}
				 class Dog {
				  
				  static public void eat()
				  {
				   System.out.println("Dog is eating");
				  }
				  static void sleep()
				  {
				   System.out.println("Dog is sleeping");
				  }
				 }
				 class Babydog extends Dog{
				  static void drink() { 
				   System.out.println(" Baby dog is drinking");
				  }
				   
				   static public void sleep()
				   {
				    System.out.println("Baby dog is sleeping");
				   }
				   }
	
