/*

*/

public class StatsDriver {
	public static void main (String[] args){
		System.out.println(Stats.mean(6, 4));
		System.out.println("expecting 5");
		System.out.println(Stats.mean(6, 6));
		System.out.println("6");
		System.out.println(Stats.mean(12.0, 15.0));
		System.out.println("expecting 13.5");
		// System.out.println(Stats.mean());
		// System.out.println("expecting an error; the method expects two integer literals");
		System.out.println(Stats.max(2,3));
		System.out.println("expecting 3");
		System.out.println(Stats.max(0,0));
		System.out.println("expecting 0");
		System.out.println(Stats.max(2.0, 3.0));
		System.out.println("expecting 3.0");
		System.out.println(Stats.max(2, 3.2));
		System.out.println("expecting error because max method expects two integer literals or two double literals");
		System.out.println(Stats.geoMean(4, 1));
		System.out.println("expecting 2");
		System.out.println(Stats.geoMean(4.0,1.0));
		System.out.println("expecting 2.0");
	}
}
