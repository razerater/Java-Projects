/* Filename: Name
 * Created: Jan. 24, 2016
 * Author: Raz Reed
 */

import java.io.*;
import java.util.Scanner;

public class Name{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your name:");
    String input = scan.nextLine();
    String initials, name1, name2;
    String inputArr[] = input.split(" ");
    // sample name: biLLy BOB joe ShmOE thornTON
    
    // defining initials
    initials = "";
    for(int i = 0; i < inputArr.length; i++){
      initials += Character.toString(inputArr[i].charAt(0)).toUpperCase();
    }
    
    // defining name1
    name1 = inputArr[inputArr.length-1].toUpperCase() + ", " + 
            Character.toString(inputArr[0].charAt(0)).toUpperCase() + 
            inputArr[0].substring(1, inputArr[0].length()).toLowerCase();
    for(int i = 1; i < inputArr.length-1; i++){
      name1 += " " + Character.toString(inputArr[i].charAt(0)).toUpperCase() + ".";
    }
    
    // defining name2
    name2 = Character.toString(inputArr[inputArr.length-1].charAt(0)).toUpperCase() + 
            inputArr[inputArr.length-1].substring(1, inputArr[inputArr.length-1].length()).toLowerCase() + ",";
    for(int i = 0; i < inputArr.length-1; i++){
      name2 += " " + Character.toString(inputArr[i].charAt(0)).toUpperCase() + 
               inputArr[i].substring(1, inputArr[i].length()).toLowerCase();
    }
    
    System.out.println("Initials: " + initials);
    System.out.println("Name (variation one): " + name1);
    System.out.println("Name (variation two): " + name2);
  }
}