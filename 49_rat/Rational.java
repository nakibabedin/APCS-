/*
TNPG NYAH | Hugo Jenkins + Boary, Anthony Sun + Corn, Nakib Abedin + Joker
APCS pd06
HW42 - Be More Rational
2021-12-04
Time Spent: 0.5 hours
DISCOS:
0. gcd only works with positive numbers so take the absolute values
QCC:
0. Are these implementations of opperations with rational numbers the most robust?
*/


public class Rational implements Comparable {
  private int p;
  private int q;

  public Rational() {
    p=0;
    q=1;
  }

  public Rational(int p, int q) {
    this();
    if (q == 0) {
      System.out.println("Denominator cannot be 0. Set to 1.");
    }
    else {
      this.p=p;
      this.q=q;

  }
}

  public double floatValue() {
    return p/(double)q;
  }

  public String toString() {
    return p+"/"+q;
  }

  public void multiply(Rational r) {
    p *= r.p;
    q *= r.q;
  }

  public void divide(Rational r) {
    p *= r.q;
    q *= r.p;
  }

  public void add(Rational r) {
    p = p*r.q + r.p*q;
    q *= r.q;
  }

  public void subtract(Rational r) {
    p = p*r.q - r.p*q;
    q *= r.q;
  }

  public static int gcd( int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);
	  int lower = a;
	  if (a == b) {
		  return a;
	  } else {
		  if (b < a) {
			  lower = b;
		  }
		  return gcd(lower, Math.abs(a - b));
	  }
  }

  public int gcd() {
    return gcd(this.p, this.q);
  }

  public void reduce() {
    int gcd = gcd(p,q);
    p /= gcd;
    q /= gcd;
  }

  public int compareTo(Object r) {
    if (r instanceof Rational) {
      return this.p*((Rational) r).q - ((Rational) r).p*this.q;
    }
    throw new ClassCastException ("\ncompareTo() input is not a Rational")
  }

  public String compareToStr(Rational r) {
    int x = compareTo(r);
    if (x > 0) {
      return "greater than";
    }
    if (x == 0) {
      return "equal to";
    }
    return "less than";
  }

  public boolean equals(Object x){
    if (x instanceof Rational) {
        Rational y = (Rational) x;
        this.reduce();
        y.reduce();
        if (this.p == y.p && this.q == y.q){
          return true;
        }
    }
    return false;

  }


}
