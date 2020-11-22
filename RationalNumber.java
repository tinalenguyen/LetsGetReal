public class RationalNumber extends RealNumber {

  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    numerator = nume;
    denominator = deno;

      if (deno < 0) deno = -deno; nume = -nume;
      if (deno == 0) nume = 0 ; deno = 1;
    reduce();
  }

  public double getValue() {
    return (double) (getNumerator() / getDenominator() ) ;

  }

  public int getNumerator() {
//return numerator

    return numerator;

  }

  public int getDenominator() {
//return the denominator

    return denominator;

  }

  public RationalNumber reciprocal() {
//return a new RationalNumber that has the same nume and deno but reversed

    return new RationalNumber( getDenominator() , getNumerator() );

  }

  public boolean equals(RationalNumber other) {
//true when RationalNumbers have the same numerators and denominators

    return ( getNumerator() == other.getNumerator() &&
             getDenominator() == other.getDenominator() ) ;

  }

  public String toString() {
//return value expressed as "3/4"

    return getNumerator()+"/"+getDenominator();

  }

  public static int gcd(int a , int b) {
//calculate the gcd of two integers using euclid's method
//used a khan academy article for this method
    int origa = 0;
    if (b > a) origa = a ; a = b ; b = origa;
    if (a == 0) return b;
    if (b == 0) return a;

    int r = a % b;
    while (r != 0){
      r = a% b;
      a = b ;
      b = r ;

    }

    return a;
  }

  public void reduce() {
//divide num and den by gcd
//add this after construction!!!!
    int greatestCD = gcd( getNumerator(), getDenominator() );
    numerator = getNumerator() / greatestCD ;
    denominator = getDenominator() / greatestCD ;

  }

  public RationalNumber multiply(RationalNumber other){
//return new rationalnumber : product of this and other

    return new RationalNumber( getNumerator() * other.getNumerator() ,
                               getDenominator() * other.getDenominator() );


}

  public RationalNumber divide(RationalNumber other){
//return new RationalNumber that is this divided by other

//multiply by reciprocal
    return new RationalNumber( getNumerator() * other.getDenominator() ,
                               getDenominator() * other.getNumerator() );

  }





}
