/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candymachine;
 import java.util.Scanner;

         /**
 *
 * Javier Duran 21122
 */
public class CandyMachine {
private static Scanner kb = new Scanner(System.in);
 
           
    public static void main(String[] args) {
        System.out.println("Welcome to THS's Computer Candy Machine!");
            System.out.println("All candy provided is virtual");
            pickCandy();
    }
    
    public static void pickCandy(){
        System.out.println("How much money do ya got?");
        double money = kb.nextDouble();
        double twix = 0.65;
        double chips = 0.50;
        double nbutter = 0.75;
        double pbcup = 0.65;
        double jfgum = 0.55;
       
                
        System.out.println("$" + money + ", that's all?");
        System.out.println("Well, lemme tell ya what we got here.");
        System.out.println("      ");
        System.out.println("A       $0.65 Twix");
        System.out.println("B       $0.50 Chips");
        System.out.println("C       $0.75 Nutter Butter");
        System.out.println("D       $0.65 Peanut Butter Cup");
        System.out.println("E       $0.55 Juicy Fruit Gum");
        System.out.println("      ");
        System.out.println("So, What'll ya have?");
        kb.nextLine();
        String choice = kb.nextLine();
        if(choice.equalsIgnoreCase("A") && money >= twix){
            System.out.println("Thanks for buying kid! Take your candy, and your change is: ");
            System.out.println(money - twix);
        }
        
        else if(choice.equalsIgnoreCase("B") && money >= chips){
            System.out.println("Thanks for buying kid! Take your candy, and your change is: ");
            System.out.println(money - chips);
        }
        else if(choice.equalsIgnoreCase("C") && money >= nbutter){
            System.out.println("Thanks for buying kid! Take your candy, and your change is: ");
            System.out.println(money - nbutter);
        }
        else if(choice.equalsIgnoreCase("D") && money >= pbcup){
            System.out.println("Thanks for buying kid! Take your candy, and your change is: ");
            System.out.println(money - pbcup);
        }
        else if(choice.equalsIgnoreCase("E") && money >= jfgum){
            System.out.println("Thanks for buying kid! Take your candy, and your change is: ");
            System.out.println(money - jfgum);
        }
        else{
            System.out.println("Sorry, ya broke kid!");
            
        }
        
    }
   }
