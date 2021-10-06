/*
TNPG: Noble Narwhals | Roster: Nakib Abedin, Joker(ducky), Nicole Zhou, Ducky(ducky)
APCS
HW13 -- Whee do BigSibs come from?
2021-10-06


DISCOVERIES
1) We found out what a constructor is.
2) The constructor essentially did what we did with the setHelloMsg method in a much more elegant manner.
3) The variable should still be defined outside of the constructor if we plan on assigning a value inside of the constructor. When we did not do so, it returned an error.

UNRESOLVED QUESTIONS
1) Were we meant to know what a constructor was beforehand?
2) How do we make the instance variable private? I tried using typing in private before it and it returned an error.

*/



public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib("Word Up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

    BigSib spaceman = new BigSib("Salutations");

    greeting = spaceman.greet("Dr. Spaceman");
    System.out.println(greeting);

    BigSib fooey = new BigSib("Hey ya");

    greeting = fooey.greet("Kong Fooey");
    System.out.println(greeting);

    BigSib mom = new BigSib("Sup");

    greeting = mom.greet("mom");
    System.out.println(greeting);

   // The code snippet that we copied from the homework directions worked correctly, but we still had to slightly refactor the code to return a greeting for each of the other people. Our output now directly matches the one given in the instructions.

  } //end main()
} //end Greet


