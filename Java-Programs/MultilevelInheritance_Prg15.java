
public class MultilevelInheritance_Prg15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Frontenddeveloper r=new Frontenddeveloper();
			r.display4();
			r.display3();
			r.dispaly2();
			r.display1();

			 }

			}
			class Job{
			 void display1(){
			  System.out.println("Job is called");
			 }
			}

			class Engineer extends Job{
			 void dispaly2() {
			  System.out.println("Engineer class ");
			 }
			}

			class Developer extends Engineer{
			 void display3() {
			  System.out.println("Developer class ");
			 }
			}
			class Frontenddeveloper extends Developer{
			 void display4() {
			  System.out.println("frontend developer class");
			 }
			}