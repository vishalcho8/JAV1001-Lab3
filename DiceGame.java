/*
  Name/Autor: Vishal Upendra Chavda
  Student ID: A00242303
  Course:     Mobile Application Development (MAPD)
  Created on: 05/10/2021 (DD/MM/YYYY)
  Description: This program will perform following functions/operations.
    A. Create different sized dice using each constructor
    B. Roll the dice and display their results (before and after)
    C. Choose one Die object and set it to show it's highest value
    D. Create 5 six-sided dice. Roll each Die in a loop until it get 5 of a kind. Count and display the number of rolls.
*/

class DiceGame {
    public static void main(String[] args) {
        int rollCount = 0;

        Die[] arrDie = new Die[8];                          //Creating an array of the class Die.

        //Calling zero argument constructor
        arrDie[0] = new Die();
        arrDie[0].roll();                                   //Set the value for the variable that determines which side is currently up.
        System.out.println("Creating a default " + arrDie[0].getType() + "...");

        //Calling one argument constructor
        arrDie[1] = new Die(20);
        arrDie[1].roll();
        System.out.println("Creating a " + arrDie[1].getType() + "...");

        //Calling two argument constructor
        arrDie[2] = new Die("d", 55);
        arrDie[2].roll();                                  
        System.out.println("Creating percentile arrDie (a special " + arrDie[2].getType() + arrDie[2].getNumberOfSides() + ")...");

        //Displaying which side is currently up for each die. (Before)
        System.out.println("The current side up for " + arrDie[0].getType() + " is " + arrDie[0].getCurSideUp());
        System.out.println("The current side up for " + arrDie[1].getType() + " is " + arrDie[1].getCurSideUp());
        System.out.println("The current side up for Percentile is " + arrDie[2].getCurSideUp());

        //Testing the rol method.
        System.out.println("");                                  //Adding  blank line to avoid untidy output
        System.out.println("Testing the roll method");
        System.out.println("");                                  //Adding  blank line to avoid untidy output

        ////Displaying which side is currently up for each die. (After)
        System.out.println("Rolling the " + arrDie[0].getType() + "...");
        arrDie[0].roll();
        System.out.println("The new value is " + arrDie[0].getCurSideUp());

        System.out.println("Rolling the " + arrDie[1].getType() + "...");
        arrDie[1].roll();
        System.out.println("The new value is " + arrDie[1].getCurSideUp());

        System.out.println("Rolling the Percentile...");
        arrDie[2].roll();
        System.out.println("The new value is " + arrDie[2].getCurSideUp());

        //Displaying highest value fir die 2 (arrDie[1])
        System.out.println("");                             //Adding  blank line to avoid untidy output
        System.out.println("Setting the " + arrDie[1].getType() + " to show " + arrDie[1].getNumberOfSides() + "...");
        do{
            arrDie[1].roll();
        }while (arrDie[1].getCurSideUp() != arrDie[1].getNumberOfSides());
        System.out.println("The side up is now " + arrDie[1].getCurSideUp() + ". Finallly.");

        //YAHTZEE!
        System.out.println("");                              //Adding  blank line to avoid untidy output
        System.out.println("Creating 5 d6...");

        //Creating 5 six-sided dice for YAHTZEE.
        for(int i = 3; i < arrDie.length; i++){
            arrDie[i] = new Die();
        }

        //Calling the roll method for each of the YAHTZEE die and increasing the count as long as all the dice have the same value.
        do{
            arrDie[3].roll();
            arrDie[4].roll();
            arrDie[5].roll();
            arrDie[6].roll();
            arrDie[7].roll();
            rollCount++;
        } while (!((arrDie[3].getCurSideUp() == arrDie[4].getCurSideUp())
                && (arrDie[4].getCurSideUp() == arrDie[5].getCurSideUp())
                && (arrDie[5].getCurSideUp() == arrDie[6].getCurSideUp())
                && (arrDie[6].getCurSideUp() == arrDie[7].getCurSideUp())));

        System.out.println("YAHTZEE! It took " + rollCount + " rolls");



    }
}
