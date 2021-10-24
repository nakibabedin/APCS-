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

public class Driver {

  public static void main( String[] args ) {
    //build Objects from blueprint specified by class Coin

    //test default constructor
      Coin mine = new Coin();
      //test 1st overloaded constructor
      Coin yours = new Coin( "quarter" );
      //test 2nd overloaded constructor
      Coin wayne = new Coin( "dollar", "heads" );
      //test toString() methods of each Coin
      System.out.println("mine: " + mine);
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test flip() method
      System.out.println("After flipping...");
      yours.flip();
      wayne.flip();
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test equals() method
      if ( yours.equals(wayne) ) {
        System.out.println( "Matchee matchee!" );
      }
      else {
        System.out.println( "No match. Firestarter you can not be." );
      }



  }//end main()

}//end class
