
// Exercise 3

public class Loops {
  public static void main (String[] args){
    public static double power(double x, int n) {
    double xToTheN = x;
    while (n > 1) {
      xToTheN = xToTheN * x;
      n = n - 1;
    }

    // needed to use a while loop in order to do this with an iterative procedure.
    // Was there any simpler way to do this?

    return xToTheN;
  }
  }
}


// Exercise 4

 public static int factorial(int n) {
    int product = n;
    int base = n;

    // Defined Variables

    while (n > 1) {
      if (n == base) {
        n = n - 1;
      } else {
          product = product * n; 
	// product keeps the original value of n for the first run and adopts the product of (n)(n-1) as thr procedure goes on
          n = n - 1;
      }
    }
    return product;
  }


// Exercise 5

// I couldn't figure out how to do excercise 5. 
