/*
Team LNN: Lior Polischouk, Nakib Abedin, Nicole Zhou
APCS pd6
HW27: FOR the Love of Strings
2021-10-28
Time elapsed: ~1.3 hours (got stuck on recursion)
*/
/*
DISCO:
0. s.length outputs the amount of characters in a string.
1. s.substring(x, y) outputs the char inbetween the xth and yth index of s.
2. The substring() method will assume that you want it to go to the last index
   if you do not have a second argument.
3. For recursive functions, you need to avoid initializing variables because
   those variables will get reset when you make a function call inside of the function.
QCC:
0. What is the best way to design a recursive algorithm?
*/

public class Rof {
    public static String fenceF (int posts) {
        String output = "|";
        for (int i = 1; i < posts; i++) {
            output += "--|";
            }
            if (posts == 0) {
                output = "No posts";
                return output;
            }
            return output;
        }
    public static String reverseF (String s) {
        String output = "";
        for (int i = s.length()-1; i >= 0; i--) {
            output += s.substring(i,i+1);
        }
        return output;
    }
    public static String reverseR (String s) {
            if (s.length() == 0) {
                return s;
            }
            else {
                  System.out.print(s.substring(s.length()-1));//prints last character
                  return reverseR(s.substring(0, s.length()-1));
                  //reruns method with s - last character
            }
    }
    public static void main( String[] args ) {
        System.out.println(fenceF(5));
        System.out.println(fenceF(0));
        System.out.println(fenceF(25));
        System.out.println(reverseF("desserts"));
        System.out.println(reverseR("stressed"));
    }
}
