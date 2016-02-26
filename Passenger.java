/* Filename: Passenger
 * Created: Feb. 7, 2016
 * Author: Raz Reed
 */

public class Passenger{
  private String name;
  private double weight;
  // weight in kilograms
  public int currentFloor = 1;
  
  public Passenger(String name, double weight){
    this.name = name;
    this.weight = weight;
  }
  
  public String getName(){
    return name;
  }
  
  public double getWeight(){
    return weight;
  }
  
  public int getCurrentFloor(){
    return currentFloor;
  }
}