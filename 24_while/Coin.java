/***
 TNPG: NAW Fam: Alif Rahman, Nakib Abedin
 APCS Period 06
 HW24--Get It While You Can
 2021-10-25

 Time Spent: 1.5 hr

 Discoveries:
 0) || essentially means "or" in java.
 1) we can use the get<varName> methods in order to get the value of a private variable from a different class.
 2) we refreshed our brains on how while loops work. The flowchart from class really helped clarify some misconceptions.

 QCC:
 0) Isn't having 65536 as the number of matches extraneous? We would need to replace it with a number divisible by our birth year either way.
 Also, can't we just assign the first number after 65536 divisible by 2005 as y to make the code cleaner?

 POST-v0 MODS:
 0)Added matchCtr variable to count the number of matches.
 1)Added getMatchCtr variable to count get the value of variable matchCtr.
 2)Aligned parts of our code (i.e the constructors, some methods) to match the handout you gave us in class.

 ***/

public class Coin {
  private double value;
  private String upFace, name;
  private int flipCtr, headsCtr, tailsCtr, matchCtr;
  private double bias = 0.5;

  //attributes aka instance vars

  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond:
   ***/
  public Coin() {
    reset("heads", 0.5);
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
      this();
      name = s;
      assignValue(s);

  }


  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
      this(s);
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

  public int getMatchCtr() {
	   return matchCtr;
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
      flipCtr = 0;
      tailsCtr = 0;
      headsCtr = 0;
      upFace = s;
      bias = d;
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
    double number = Math.random();
    if (number < bias) {
      upFace = "heads";
      headsCtr += 1;
    }else{
      upFace = "tails";
      headsCtr += 1;
    }
    flipCtr += 1;
    return upFace;
  }


  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {
	   if (upFace == other.upFace){
       matchCtr += 1;
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
