/* Filename: Elevator
 * Created: Feb. 7, 2016
 * Author: Raz Reed
 */

import java.util.*;

public class Elevator{
  private int currentFloor, numTrips;
  private double maxCap;
  // maxCap stores the maximum weight an elevator can hold (in kilograms)
  private final int floors = 10;
  // you can't change the number of floors the SLA building has
  private String name;
  public ArrayList<Passenger> passengers = new ArrayList<Passenger>();
  
  public Elevator(double maxCap, String name){
    this.maxCap = maxCap;
    this.name = name;
    currentFloor = 1;
    numTrips = 0;
  }
  
  public String getName(){
    return name;
  }
  
  public int getMaxFloor(){
    return floors;
  }
  
  public double getMaxCap(){
    return maxCap;
  }
  
  public int getCurrentFloor(){
    return currentFloor;
  }
  
  public int getNumberOfTrips(){
    return numTrips;
  }
  
  public void listPassengers(){
    System.out.print("{ ");
    for(Passenger p : passengers){
      System.out.print(p.getName() + " ");
    }
    System.out.println("}");
  }
  
  public void enter(Passenger guy){
    int totalWeight = 0;
    for(Passenger p : passengers){
      totalWeight += p.getWeight();
    }
    if(totalWeight <= maxCap){
      if(currentFloor != guy.getCurrentFloor()){
        goToFloor(guy.getCurrentFloor());
      }
      if(!passengers.contains(guy)){
        passengers.add(guy);
        System.out.println(guy.getName() + " has entered " + name + ".");
      }
      else{
        System.out.println(guy.getName() + " is already in " + name + ".");
      }
    }
    else{
      System.out.println(name + " cannot hold any more passengers.");
    }
  }
  
  public void exit(Passenger guy){
    if(passengers.contains(guy)){
      passengers.remove(guy);
      System.out.println(guy.getName() + " has exited " + name + ".");
    }
    else{
      System.out.println(guy.getName() + " is not in " + name + ".");
    }
  }
  
  public void goToFloor(int floor){
    if(floor <= floors && floor > 0){
      for(Passenger p : passengers){
        p.currentFloor = floor;
      }
      if(floor > currentFloor){
        System.out.println("Going from " + currentFloor + " up to " + floor);
        for(int i = currentFloor+1; i <= floor; i++){
          System.out.println("Going up to: " + i);
        }
        System.out.println("Open at " + floor);
        numTrips++;
      }
      else if(floor < currentFloor){
        System.out.println("Going from " + currentFloor + " down to " + floor);
        for(int i = currentFloor-1; i >= floor; i--){
          System.out.println("Going down to: " + i);
        }
        System.out.println("Open at " + floor);
        numTrips++;
      }
      else{
        System.out.println(name + " is already at selected floor: " + floor);
      }
      currentFloor = floor;
    }
    else{
      System.out.println("Selected floor " + floor + " not in the range of 1..." + floors);
    }
  }
  
  public String toString(){
    return name + " has " + passengers.size() + " passengers and has made " + numTrips + " trips.";
  }
}