/*
TNPG: Noble Narwhals | Roster: Nakib Abedin, Joker(ducky), Nicole Zhou, Ducky(ducky)
APCS
HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
2021-10-05


DISCOVERIES
1) When we create a method containing helloMsg, an instance variable, we received an error if we us$
2) You can define a variable without a method. This was similar to global variables in NetLogo and $
UNRESOLVED QUESTIONS
1) Can anything take the place of "static" in the method header?
2) Was it possible to code this homework without removing "static" from the method header?

*/



public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

    BigSib spaceman = new BigSib();
    spaceman.setHelloMsg("Salutations");

    greeting = spaceman.greet("Dr. Spaceman");
    System.out.println(greeting);

    BigSib fooey = new BigSib();
    fooey.setHelloMsg("Hey ya");

    greeting = fooey.greet("Kong Fooey");
    System.out.println(greeting);

    BigSib mom = new BigSib();
    mom.setHelloMsg("Sup");

    greeting = mom.greet("mom");
    System.out.println(greeting);


   // The code snippet that we copied from the homework directions worked correctly, but we still had to slightly refactor the code to return a greeting for each of the other people. Our output now directly matches the one given in the instructions.

  } //end main()
} //end Greet


