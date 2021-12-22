public class Driver {
  public static void main(String[] args) {



   Rational r;
   Rational s;
   Rational t;

   r = new Rational(1,8);
   s = new Rational(1,2);
   t = new Rational(2,16);
   System.out.print(r+" is equal to "+s+": ");
   System.out.println(r.equals(s));
   System.out.print(r+" is equal to "+t+": ");
   System.out.println(r.equals(t));
   System.out.print(r+" is equal to \"Hello\": ");
   System.out.println(r.equals("Hello"));

   r = new Rational(1,8);
   s = new Rational(1,2);
   t = new Rational(2,16);
   System.out.println("r.compareTo(s) --> " + r.compareTo(s) + " ... expecting negative");
   System.out.println("s.compareTo(r) --> " + s.compareTo(r) + " ... expecting positive");
   System.out.println("r.compareTo(t) --> " + r.compareTo(t) + " ... expecting 0");
   System.out.println("t.compareTo(r) --> " + t.compareTo(r) + " ... expecting 0");
   System.out.println("s.compareTo(t) --> " + s.compareTo(t) + " ... expecting positive");
   System.out.println("t.compareTo(s) --> " + t.compareTo(s) + " ... expecting negative");
   System.out.println("r.compareTo(r) --> " + r.compareTo(r) + " ... expecting 0");
   System.out.println("s.compareTo(s) --> " + s.compareTo(s) + " ... expecting 0");
   System.out.println("t.compareTo(t) --> " + t.compareTo(t) + " ... expecting 0");


  }
}
