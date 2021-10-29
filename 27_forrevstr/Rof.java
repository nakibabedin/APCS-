/*
Team LNN: Lior Polischouk, Nakib Abedin, Nicole Zhou
APCS pd6
HW27: FOR the Love of Strings
2021-10-28
Time elapsed: 1.0 hr
*/

/*
DISCO:
0. the substring() method is exclusive for the second argument when defining the range
1. the substring() method will assume that you want it to go to the last index if you do not have a second argument.
2. for recursive functions, you need to avoid initializing variables because those variables will get reset when you make a function call inside of the function.

QCC:
0. what is the best way to design a recursive algorithm? 
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

    public static String reverseR(String s){
      if (s.length()-1 == 0){
        return s;
      }else{
        return s.substring(s.length()-1, s.length()) + reverseR(s.substring(0,s.length()-1));
      }

    }


    public static void main( String[] args ) {
        System.out.println(fenceF(5));
        System.out.println(fenceF(0));
        System.out.println(fenceF(25));
        System.out.println(reverseF("desserts"));
        System.out.println(reverseR("desserts"));
        System.out.println(reverseR("stressed"));
    }
}
