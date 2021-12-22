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



  }
}
