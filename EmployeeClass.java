/* Filename: TestEmployeeClass
 * Created: Jan. 12, 2016
 * Author: Raz Reed
 */

public class EmployeeClass{
  private String fullName, firstName, lastName;
  private double salary;
  
  public EmployeeClass(String fullName, double salary){
    this.fullName = fullName;
    this.salary = salary;
  }
  
  public EmployeeClass(String firstName, String lastName, double salary){
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
    fullName = firstName + " " + lastName;
  }
  
  public String getName(){
    return fullName;
  }
  
  public double getSalary(){
    return salary;
  }
  
  public double raise(double percent){
    salary += salary + percent*0.01;
    return salary;
  }
}