/***
 TNPG: NAW Fam: Alif Rahman, Nakib Abedin
 APCS Period 06
 HW23 -- What does equality look like?
 2021-10-24
 Time Spent: 1.5 hour

 DISCOVERIES:
 1) You can have an object as an argument for a method

 Questions:
 1) Did we use bias correctly for the flip() method?
 2) Did we code the reset() method correctly?
 ***/

public class Coin {
  private double value;
  private String upFace;
  private String name;
  private int flipCtr;
  private int headsCtr;
  private int tailsCtr;
  private double bias;

  //attributes aka instance vars

  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond:
   ***/
  public Coin() {
  }

  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/
  public Coin( String s ) {
      name = s;
  }


  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
      name = s;
      upFace = nowFace;
  }


  // Accessors...
  // ----------------------------
  public String getUpFace() {
	   return upFace;
  }

  public int getFlipCtr() {
	   return flipCtr;
  }

  public double getValue() {
	   return value;
  }

  public int getHeadsCtr() {
	   return headsCtr;
  }

  public int getTailsCtr() {
	   return tailsCtr;
  }

  // ----------------------------


  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/
  private double assignValue( String s ) {
	   if (s == "penny"){
       value = 0.01;
     }else if(s == "nickel"){
       value = 0.05;
     }else if(s == "dime"){
       value = 0.10;
     }else if(s == "quarter"){
       value = 0.25;
     }else if(s == "half dollar"){
       value = 0.50;
     }else if (s == "dollar"){
       value = 1.00;
     }
     return value;
  }


  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/

  public void reset( String s, double d ) {
      upFace = s;
      value = d;
      // We were a little confused on what to do for this method
  }


  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/
  public String flip() {
    bias = 0.5;
    double number = Math.random();
    if (number < bias) {
      upFace = "heads";
      flipCtr += 1;
      headsCtr += 1;
      return "heads";
    }else{
      upFace = "tails";
      flipCtr += 1;
      headsCtr += 1;
      return "tails";
    }
  }


  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {
	   if (upFace == other.upFace){
       return true;
     }else{
       return false;
     }
  }


  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
	  return ("my name is " + name + " and my face is " + upFace);
  }

}//end class
