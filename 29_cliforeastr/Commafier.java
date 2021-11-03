/*
Insert Heading
*/

public class Commafier {
  // Commafies int x with recursion

  /*
  public static String commafyR(int x){
    //body
    String s = Integer.toString(x); // s is the string version of x
    if(s.length() == 1){
      return s.substring(0,1);
    }else{
      String recursiveS = s.substring(1);
      System.out.println(recursiveS.substring(0,1));
      if (recursiveS.substring(1,2) == "0"){
        s = s.substring(0,1) + "0" + commafyR(Integer.parseInt(recursiveS));
        return s;
      }else{
        s = s.substring(0,1) + commafyR(Integer.parseInt(recursiveS));
        return s;
      }
    }
  }
  //FAILED ATTEMPT
  */

  public static String commafyR(int x){

    String s = Integer.toString(x); // s is the string version of x
    if (s.length() <= 3){ // base case
      return s;
    }else{
      return commafyR(Integer.parseInt(s.substring(0, s.length()-3))) + "," + s.substring(s.length()-3);
    }

  }

  // Commafies int x with iteration
  public static String commafyF(int x){
    String output = "";
    String i;
    String s = Integer.toString(x);
    // While loop used because we don't know the number of commas that we will need.
    while(s.length() > 3){
      i = s.substring(s.length()-3, s.length());
      s = s.substring(0,s.length()-3);
      output = output + "," + i;
    }
    return s + output;
  }

  public static void main(String[] args){
    int arguments[] = {1, 10, 101, 1000, 12345, 1000000};
    for( int s : arguments ) {
    System.out.println(commafyR(s));
    System.out.println(commafyF(s));
    }

    /*
    System.out.println(commafyR(1) + "... expecting 1");
    System.out.println(commafyR(10) + "... expecting 10");
    System.out.println(commafyR(101) + "... expecting 101");
    System.out.println(commafyR(1000) + "... expecting 1,000");
    System.out.println(commafyR(12345) + "... expecting 12,345");
    System.out.println(commafyR(1000000) + "... expecting 1,000,000");
    */

    //System.out.println(commafyF(1) + "... expecting 1");

    /*
    System.out.println(commafyF(10) + "... expecting 10");
    System.out.println(commafyF(101) + "... expecting 101");
    System.out.println(commafyF(1000) + "... expecting 1,000");
    System.out.println(commafyF(12345) + "... expecting 12,345");
    System.out.println(commafyF(1000000) + "... expecting 1,000,000");
    */
  }
}
