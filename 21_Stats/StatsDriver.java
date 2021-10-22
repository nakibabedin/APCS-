/*
   TNPG: NAW FAM -- ALIF RAHMAN, GRIPPY (ducky), NAKIB ABEDIN, JOKER (ducky)
   APCS
   HW21 -- STAtisTically Speaking...
   2021-10-21
   TASK:
   Implement each method without typecasting.
   xtra: harmonic mean is the reciprocal of the
   arithmetic mean of the reciprocals
   DISCO
   - Java automatically floor divides when dividing two ints. i.e. 3/2 -> 1
   - Typecasting changes the type of the literal.
   QCC
   - We didn't see a way to calculate geoMean() without using the class Math.
   - How would you convert the sqrt (which is a double) into an int without typecasting?
 */

public class StatsDriver {
	public static void main (String[] args){
		System.out.println(Stats.mean(6, 4) + " | 5");
		System.out.println(Stats.mean(6, 6) + " | 6");
		System.out.println(Stats.mean(12.0, 15.0) + " | 13.5");
		// System.out.println(Stats.mean());
		// System.out.println("expecting an error; the method expects two integer literals");
		System.out.println(Stats.max(2,3) + " | 3");
		System.out.println(Stats.max(0,0) + " | 0");
		System.out.println(Stats.max(2.0, 3.0) + " | 3.0");
		//System.out.println(Stats.max(2, 3.2));
		//System.out.println("expecting error because max method expects two integer literals or two double literals");
    System.out.println(Stats.geoMean(4, 1) + " | 2");
		System.out.println(Stats.geoMean(4.0,1.0) + " | 2.0");
		System.out.println(Stats.geoMean(6, 1) + " | 2");
		System.out.println(Stats.geoMean(6.0,1.0) + " | 2.4494...");
    System.out.println(Stats.geoMean(4, 1, 9) + " | 6");
    System.out.println(Stats.geoMean(4.0, 1.0, 9.0) + " | 6.0");
    System.out.println(Stats.geoMean(6, 1, 7) + " | 6");
    System.out.println(Stats.geoMean(6.0, 1.0, 7.0) + " | 6.4807...");
	}
}
