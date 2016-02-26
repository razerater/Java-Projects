/* Filename: NumberGuess
 * Created: Jan. 15, 2016
 * Author: Raz Reed
 */

import java.io.*;
import java.util.Scanner;

public class NumberGuess{
  public static void main(String[] args){
    int num = 1+(int)(Math.random()*100.0);
    System.out.println(num);
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the Guessing Game!");
    System.out.println("I'm thinking of a number between 1 and 100 - what's your guess?");
    for(int i = 0; i < 7; i++){
      int input = scan.nextInt();
      if(i == 6 && num != input){
        System.out.println("Sorry, you only get 7 guesses - the number is " + num + "!");
      }
      else if(num < input){
        System.out.println("That's too high. Try again!");
      }
      else if(num > input){
        System.out.println("That's too low. Try again!");
      }
      else{
        System.out.println("That's right - how did you know?");
        break;
      }
    }
  }
}