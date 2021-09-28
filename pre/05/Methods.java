public class Methods {
  public static void main (String[] args){
  }

  // Exercise 2

  public static boolean isDivisible(int n, int m) {
    if (n % m == 0){
      return true;
  }
    else {
      return false;
    }
  }

  // Exercise 3

  public static boolean isTriangle (int a, int b, int c){
    if (a > b+c){
      return false;
    }
    else if(b > a+c){
      return false;
    }
    else if(c > a+b){
      return false;
    }
    else
      return true;
  }

  // Excercise 8
  class Help {
  public static void main(String[] args) {


    System.out.println(ack(0,1));

  }



  public static int ack(int m, int n) {

    if (m == 0) {
      return n+1;
    } else if (m > 0 && n == 0) {
      ack(m-1,1);
    } else if (m > 0 && n > 0) {
      ack(m-1, ack(m, n-1) );
    }

    return 0;

  }



} // end bracket
