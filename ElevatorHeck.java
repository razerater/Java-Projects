/* Filename: ElevatorHeck
 * Created: Feb. 12, 2016
 * Author: Raz Reed
 */

import java.io.*;
import java.util.Scanner;

public class ElevatorHeck{
  public static void main(String[] args){
    final int floors = 57;
    Elevator el1 = new Elevator(floors, "Comcast 1");
    Elevator el2 = new Elevator(floors, "Comcast 2");
    Scanner scan = new Scanner(System.in);
    
    while(true){
      System.out.println("Enter floor where elevator is needed for pickup (0 to quit):");
      int pickupFloor = scan.nextInt();
      if(pickupFloor > 0 && pickupFloor <= floors){
        if(Math.abs(el1.getCurrentFloor()-pickupFloor) < Math.abs(el2.getCurrentFloor()-pickupFloor)){
          // el1 is closer to pickupFloor than el2
          System.out.println(el1.getName() + " is closest:");
          System.out.print(el1.getName() + ": ");
          el1.goToFloor(pickupFloor);
          System.out.println("Enter floor to take passenger to:");
          int nextFloor = scan.nextInt();
          System.out.print(el1.getName() + ": ");
          el1.goToFloor(nextFloor);
        }
        else{
          // el2 is closer to pickupFloor than el1 or they are equally distant from pickupFloor
          System.out.println(el2.getName() + " is closest:");
          System.out.print(el2.getName() + ": ");
          el2.goToFloor(pickupFloor);
          System.out.println("Enter floor to take passenger to:");
          int nextFloor = scan.nextInt();
          System.out.print(el2.getName() + ": ");
          el2.goToFloor(nextFloor);
        }
      }
      else if(pickupFloor == 0){
        System.out.println(el1.toString());
        System.out.println(el2.toString());
        break;
      }
      else{
        System.out.println("Not a valid floor.");
      }
    }
  }
}