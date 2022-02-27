
public class ArrayOfObjects_Prg34 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Employee e[] = new Employee[6];
  e[0] = new Employee("david", 34000);
  e[1] = new Employee("renu", 23000);
  e[2] = new Employee("devu", 18000);
  e[3] = new Employee("devika", 25000);
  e[4] = new Employee("elsa", 21000);
  e[5] = new Employee("benny", 16000);

  for (int i = 0; i < e.length; i++) {
   System.out.println("name:" + e[i].name + " " + "salary:" + e[i].salary);
  }

  System.out.println("   ");
  System.out.println("Removing elements");

  for (int i = 1; i < e.length - 1; i++) {
   e[i] = e[i + 1];

  }

  for (int i = 0; i < e.length - 1; i++) {
   System.out.println("name:" + e[i].name + " " + "salary:" + e[i].salary);
  }

 }

}

class Employee {
 String name;
 int salary;

 public Employee(String name, int salary) {
  super();
  this.name = name;
  this.salary = salary;
 }

}