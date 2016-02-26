/* Filename: TestElevator
 * Created: Feb. 9, 2016
 * Author: Raz Reed
 */

public class TestElevator{
  public static void main(String[] args){
    Elevator el1 = new Elevator(1000, "Elevator 1");
    Elevator el2 = new Elevator(1000, "Elevator 2");
    Passenger raz = new Passenger("Raz", 61);
    Passenger des = new Passenger("Des", 63.5);
    System.out.println(el1.toString());
    System.out.println(el2.toString());
    el1.goToFloor(7);
    el1.goToFloor(4);
    System.out.println(el1.toString());
    el1.goToFloor(11);
    el1.goToFloor(0);
    System.out.println(el1.toString());
    el1.goToFloor(1);
    System.out.println(el1.toString());
    el1.goToFloor(1);
    System.out.println(el1.toString());
    System.out.println(el2.toString());
    System.out.println(des.getName() + " is on floor " + des.getCurrentFloor());
    el2.enter(des);
    System.out.println(des.getName() + " is on floor " + des.getCurrentFloor());
    el2.goToFloor(5);
    System.out.println(des.getName() + " is on floor " + des.getCurrentFloor());
    el2.exit(des);
    System.out.println(des.getName() + " is on floor " + des.getCurrentFloor());
    el2.enter(raz);
    el2.listPassengers();
    el2.enter(des);
    el2.listPassengers();
  }
}