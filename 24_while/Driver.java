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

public class Driver {

  public static void main( String[] args ) {
    //build ObjecAts from blueprint specified by class Coin

    //test default constructor
      Coin mine = new Coin();
      //test 1st overloaded constructor
      Coin yours = new Coin( "quarter" );
      //test 2nd overloaded constructor
      Coin wayne = new Coin( "dollar", "heads" );
      //test toString() methods of each Coin
      //System.out.println("mine: " + mine);
      //System.out.println("yours: " + yours);
      //System.out.println("wayne: " + wayne);
      //test flip() method
      //System.out.println("After flipping...");
      //yours.flip();
      //wayne.flip();
      //System.out.println("yours: " + yours);
      //System.out.println("wayne: " + wayne);


      int y = 67500; // set to 67500 because it is the first number after 65536 that is divisible by 2005
      int x = 270000; // we found that 4 times the y value is the sweet spot for the x value since the chance of a match is 1/4.


      while (yours.getMatchCtr() < y || yours.getHeadsCtr() + wayne.getHeadsCtr() <= x){
        yours.flip();
        wayne.flip();
        yours.equals(wayne);
        System.out.println("Match Counter: " + yours.getMatchCtr());
        System.out.println("Head Counter: " + (yours.getHeadsCtr() + wayne.getHeadsCtr()));
      }

      /*
      //test equals() method
      if ( yours.equals(wayne) ) {
        System.out.println( "Matchee matchee!" );
      }
      else {
        System.out.println( "No match. Firestarter you can not be." );
      }
      System.out.println(yours.getMatchCtr());

      */




  }//end main()

}//end class
