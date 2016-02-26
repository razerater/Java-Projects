/* Filename: TestEmployeeClass
 * Created: Jan. 12, 2016
 * Author: Raz Reed
 */

public class TestEmployeeClass{
  public static void main(String[] args){
    EmployeeClass dwight = new EmployeeClass("Dwight Schrute", 40000.0);
    EmployeeClass jim = new EmployeeClass("Jim", "Halpert", 45000.0);
    EmployeeClass michael = new EmployeeClass("Michael Scott", 60002.0);
    
    System.out.println(dwight.getName()); // Dwight Schrute
    System.out.println(jim.getName()); // Jim Halpert
    
    System.out.println(dwight.getSalary()); // 40000.0
    System.out.println(jim.getSalary()); // 45000.0
    
    // give each employee a 3% raise
    dwight.raise(3.0);
    jim.raise(3.0);
    michael.raise(3.0);
    
    System.out.println(dwight.getSalary()); // 41200.0
    System.out.println(jim.getSalary()); // 46350.0
    
    System.out.println(michael.getName() + "'s current salary is: $" + michael.getSalary());
  }
}