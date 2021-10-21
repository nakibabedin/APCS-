import java.lang.Math;

/**
   TNPG: NAW FAM -- ALIF RAHMAN, NAKIB ABEDIN, JOKER (ducky)
   APCS
   HW20 --
   2021-10-21
   TASK:
   Implement each method without typecasting.
   xtra: harmonic mean is the reciprocal of the
   arithmetic mean of the reciprocals
 **/

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
	if (a > b){ 
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
	int product = a * b;
	int gmean = Math.pow(product);
	return gmean;
  }

/*
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
	int product = a * b * c;
	int gmean = Math.sqrt(product);
	return gmean;
	
  }

  public static double geoMean(double a, double b, double c) {
	double product = a * b * c;
        double gmean = Math.sqrt(product);
        return gmean;
  }


  //main method for testing functionality
  public static void main( String[] args ) {
	System.out.print("StatsLol");
  }
*/

}//end class


