/***
 *  class Coin
 *  by NOT Clyde "Thluffy" Sinclair
 *  SKELETON
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
	return null;
  }

  public int getFlipCtr() {
	return 0;
  }

  public double getValue() {
	return 0.0;
  }

  public int getHeadsCtr() {
	return 0;
  }

  public int getTailsCtr() {
	return 0;
  }
  // ----------------------------


  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/
  private double assignValue( String s ) {
	return 0.0;
  }


  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  public void reset( String s, double d ) {

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
  public static double flip() {
    double number = Math.random();
    System.out.println(number);
	return number;
  }


  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {
	return true;
  }


  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
	return null;
  }

}//end class
