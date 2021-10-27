/*
  TNPG: NAW Fam: Alif Rahman, Nakib Abedin
  APCS Period 06
  HW25: Do I repeat myself?
  2021-10-26
  Time Spent: 1.0 hr
  Discoveries:
  0) You can simply return literals. They do not need to be returned as a variable.
  1) The ++ increments the variable by 1.
  2) Refreshed our memory on how recursion works --> you really can call the function inside of itself!
  QCC:
  0) What is the point of recursion if we could just use while loops?
*/

public class Repeater {

  public static String fenceW(int numPosts) {
    String answer = "|";
    int counter = 1;
    while (counter < numPosts) {
      answer = answer + "--|";
      counter ++;
    }
    return answer;
  }

  public static String fenceR(int numPosts) {
    if (numPosts == 1) {
      return "|";
    }else {
      return fenceR(numPosts-1) + "--|";
    }
  }

  public static void main(String[] args) {
    for (int i = 1; i < 4; i++) {
      System.out.println(fenceW(i));
    }
    for (int i = 1; i < 4; i++) {
      System.out.println(fenceR(i));
    }
  }

} //end of class
