/***
 * NAW FAM :: ALIF RAHMAN (assisted by GRIPPY) and NAKIB ABEDIN (assisted by JOKER)
 * APCS
 * HW31 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
 * 2021-11-04
 * time spent: 1 hr

 Discoveries:
 1) We found out what a final variable does
 2) We got better at applying the forEach loop to different scenarios.
 3) We applied linear search

 QCC:
 1) Should we have made our code applicable to capital case letters?
 *
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

public class Pig
{
  //Q: How does this initialization make your life easier?
  //A: It defines which letters we will count as vowels, meaning that y is not included.
  // It also lets us know that we won't have to worry about capital letters.
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter )
  {
    /* YOUR IMPLEMENTATION HERE */
    return w.indexOf(letter) != -1;
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter )
  {
    /* YOUR IMPLEMENTATION HERE */
    return hasA(VOWELS, letter);
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w )
  {
    /* YOUR IMPLEMENTATION HERE */
    return allVowels(w).length();
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w )
  {
    /* YOUR IMPLEMENTATION HERE */
    return countVowels(w) != 0;
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w )
  {
    /* YOUR IMPLEMENTATION HERE */
    String wArray[] = w.split("");
    String answer = "";
    for (String letter : wArray) {
      if (isAVowel(letter)) {
          answer += letter;
      }
    }
    return answer;
  }


  public static void main( String[] args )
  {
    /* YOUR TEST CALLS HERE */
    System.out.println(hasA("cat", "a") + " ... expecting true");
    System.out.println(hasA("cat", "p") + " ... expecting false");
    System.out.println(isAVowel("a") + " ... expecting true");
    System.out.println(isAVowel("e") + " ... expecting true");
    System.out.println(isAVowel("i") + " ... expecting true");
    System.out.println(isAVowel("o") + " ... expecting true");
    System.out.println(isAVowel("u") + " ... expecting true");
    System.out.println(isAVowel("y") + " ... expecting false");
    System.out.println(countVowels("meatball") + " ... expecting 3");
    System.out.println(allVowels("meatball") + " ... expecitng 'eaa'");
  }//end main()

}//end class Pig
