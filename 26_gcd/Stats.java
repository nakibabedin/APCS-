/*
   TNPG: NAW FAM -- ALIF RAHMAN, NAKIB ABEDIN, WILLIAM VONGPHANITH
   APCS
   HW26: GCD Three Ways
   2021-10-21
   TASK:
   time spent: 1.0 hour
   DISCO
   - If you mod a smaller number by a bigger number, the smaller number is returned.
   QCC
   -
 */

public class Stats {

  public static int mean(int a, int b) {
	   int sum = a + b;
	   int mean = sum/2;
	   return mean;
  }

  public static double mean(double a, double b) {
	   double sum = a + b;
	   double mean = sum/2;
	   return mean;
  }

  public static int max(int a, int b) {
    if (a > b) {
       return a;
	}else{
		   return b;
	}
  }

  public static double max(double a, double b) {
	   if (a > b){
       return a;
	   }else{
       return b;
	}
  }

  public static int geoMean(int a, int b) {
    int answer = 0;
    int product = a*b;
    double gmean = Math.sqrt(product);
    while ((answer) < gmean) { // basically saying if answer is less than the geometric mean, add one. When the loop finishes the answer will be equal to either exactly gmean or rounded up gmean.
      answer += 1;
    }
    if ((answer) == gmean) { // if the answer is equal to gmean, just return answer
      return answer;
    }
    else { // if this code runs, that means gmean is not a whole number. Therefore, the while loop would have produced an answer that is a rounded up gmean. We want to floor. Therefore, subtract 1.
      return answer - 1;
    }
  }

  public static double geoMean(double a, double b) {
	double product = a * b;
	double gmean = Math.sqrt(product);
	return gmean;
  }

  public static int max(int a, int b, int c) {
	if (a > c & a > b){
		return a;
	}else
		if (b > a & b > c){
			return b;
		}else {
			return c;
		}
  }

  public static double max(double a, double b, double c) {
	if (a > c & a > b){
                return a;
        }else
                if (b > a & b > c){
                        return b;
                }else {
                        return c;
                }
  }

  public static int geoMean(int a, int b, int c) {
    int answer = 0;
    int product = a*b*c;
    double gmean = Math.sqrt(product);
    while ((answer) < gmean) {
      answer += 1;
    }
    if ((answer) == gmean) {
      return answer;
    }
    else {
      return answer - 1;
    }
  }

  public static double geoMean(double a, double b, double c) {
	double product = a * b * c;
        double gmean = Math.sqrt(product);
        return gmean;
  }

  public static int gcd(int a, int b) {
    int answer;
    if (a > b) {
      answer = b;
      while (a % answer != 0 || b % answer != 0) {
        answer = answer -1;
      }
    }else {
      answer = a;
      while (a % answer != 0 || b % answer != 0) {
        answer =answer -1;
      }
    }
     return answer;
  }

  public static int gcdER( int a, int b) {
    if (a == 0) {
      return b;
    }
      return gcdER(b%a, a);
    }

  public static int gcdEW( int a, int b) {
    while (a > b) {
			a -= b;
		}
		return a;
}

  //main method for testing functionality
  public static void main(String[] args) {
    System.out.println(gcd(15,10));
    System.out.println(gcd(45,51));
    System.out.println(gcdER(15,10));
    System.out.println(gcdER(45,51));
    System.out.println(gcdEW(15,10));
    System.out.println(gcdEW(45,51));
  }


}//end class
