// TNPG: NYA -- Anthony Sun + Corn; Nakib Abedin + Joker
// APCS pd06
// HW47 -- Binary Search
// 2021-12-15
// time spent: 0.5 hrs

/***
    DISCO:
    0. Entering in a larger number than the high bound enlarges the rang unintentionally
    1. break exits a loop
    2. return exits a method 
    QCC:
    0. Should invalid guesses (i.e. ones that are outside of the given range) be counted towards the guessCtr ?
 ***/

/***
 * class GuessNumber -- fun fun fun!
 *
 * SKELETON
 *
 * eg, sample interaction with end user:
 *
 * Guess a # fr 1-100: 50
 * Too high
 * Guess a # fr 1-49: 25
 * Too low
 * Guess a # fr 26-49: 38
 * Correct! It took 3 guesses
 ***/


import java.util.Scanner;

public class GuessNumber
{

  //instance vars
  private int _lo, _hi, _guessCtr, _target;
  Scanner sc = new Scanner( System.in );


  /*==================================================
    constructor -- initializes a guess-a-number game
    pre:
    post: _lo is lower bound, _hi is upper bound,
    _guessCtr is 1, _target is random int on range [_lo,_hi]
    ==================================================*/
  public GuessNumber( int a, int b )
  {
    _lo = Math.min(a,b);
    _hi = Math.max(a,b);
    _guessCtr = 0;

    //pick random number in range [a,b]


    /* YOUR CODE HERE */

    _target = (int) (Math.random() * (_hi - _lo + 1)) + _lo; // inclusive

  }


  /*==================================================
    void playRec() -- Prompts a user to guess until guess is correct.
    Uses recursion.
    ==================================================*/
  public void playRec()
  {
    System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
    int guess = sc.nextInt();

        //3 cases: we either found it, too hi, too lo

        /* YOUR CODE HERE */

    _guessCtr++;

    if (guess == _target){
      System.out.println("Correct! It took " + _guessCtr + " guesses");
      return;
    }else if (guess < _target){
      System.out.println("Too low");
      setLoHi(guess,"lo");
      playRec();
    }else{
      System.out.println("Too high");
      setLoHi(guess,"hi");
      playRec();
    }

  }


  /*==================================================
    void playIter() -- Prompts a user to guess until guess is correct.
    Uses iteration.
    ==================================================*/
  public void playIter()
  {

    int guess;

    while( true ) {
      _guessCtr++;
      System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
      guess = sc.nextInt();

      if (guess == _target){
        System.out.println("Correct! It took " + _guessCtr + " guesses");
        break;
      }else if (guess < _target){
        System.out.println("Too low");
        setLoHi(guess,"lo");
      }else{
        System.out.println("Too high");
        setLoHi(guess,"hi");
      }

      //3 cases: we either found it, too hi, too lo

      /* YOUR CODE HERE */

      _guessCtr++;
    }
  }

  public void setLoHi(int guess, String choice) {
    if (choice == "hi") {
      if (guess > _hi) {
        System.out.println("Please enter a number less or equal to than the high bound");
        _guessCtr--;
      }
      else {
        _hi = guess - 1;
      }
    }

    if (choice == "lo") {
      if (guess < _lo) {
        System.out.println("Please enter a number greater than or equal to the low bound");
        _guessCtr--;
      }
      else {
        _lo = guess + 1;
      }
    }
  }


  //wrapper for playRec/playIter to simplify calling
  public void play()
  {
    //use one or the other below:
    //playRec();
    System.out.println("Target number is: " + _target);
    playIter();
  }


  //main method to run it all
  public static void main( String[] args )
  {
    //instantiate a new game
    GuessNumber g = new GuessNumber(1,100);

    //start the game
    g.play();
    /*-----------------------------

    -----------------------------*/
  }

}//end class GuessNumber
