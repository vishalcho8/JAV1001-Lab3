/*
  Name/Autor: Vishal Upendra Chavda
  Student ID: A00242303
  Course:     Mobile Application Development (MAPD)
  Created on: 05/10/2021 (DD/MM/YYYY)
  Description: This program will perform following functions/operations.
    A. Set the value of private variables using appropriate constructors based on values passed to it.
    B. Set the value for variable (curSideUp) that determines which side is currently up using roll method.
    C. Create accessors to get the value of the corresponding class member.
*/

public class Die {
    //Declaring class members
    private String type;
    private int numberOfSides;
    private int curSideUp;

    // Constructor with no parameter
    public Die() {
        this.type = "d6";
        this.numberOfSides = 6;
    }

    // Constructor with 1 parameter
    public Die(int numberOfSides) {
        this.type = "d"+numberOfSides;
        this.numberOfSides = numberOfSides;
    }

    // Constructor with 2 parameters
    public Die(String type , int numberOfSides) {
        this.type = type;
        this.numberOfSides = numberOfSides;
    }

    // accessors - get Methods
    public String getType(){ return type; }
    public int getNumberOfSides(){ return numberOfSides; }
    public int getCurSideUp(){ return curSideUp; }

    /* mutators - set methods
        we don't need following setter methods as we should not let the user change number of side and the type.
        Secondly, roll method determines which side is currently up, so we also don't require diffrent setter method for that.

    public void setType(String type){
        this.type = type;
    }

    public void setNumberOfSides(int numberOfSides){
        this.numberOfSides = numberOfSides;
    }
    public void setCurSideUp(int curSideUp){
        this.curSideUp = curSideUp;
    } */

     /* roll(): This method is a setter method to set the value for variable curSideUp.
        It will generate a random integer number beween 1 and numberOfSides passed.
        Math.random() --> It generates random number between 0.0 and 1.0,
        hence we require to use below formula along with Math.random() to generate number between 1 and numberOfSides passed.
     */

     public void roll(){
         int numFrom = 1;
         int numTo = numberOfSides;
         int range = numberOfSides - numFrom + 1;        // +1 includes the the entire rage between the given number including the max number.
         curSideUp =  ((int) (Math.random()*(range))) + numFrom; //Formula to generate number between the range of certain numbers.
     }
}
