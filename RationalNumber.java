public class RationalNumber extends Number {

  private int numerator, denominator;

  public RationalNumber(int nume, int deno){

    numerator = nume;
    denominator = deno;

      if (denominator == 0){
        numerator = 0 ;
        denominator = 1;
      }
      reduce();
      if (denominator < 0) {
        denominator *= -1;
        numerator *= -1;
      }
  }

  public int getNumerator() {
//return numerator

    return numerator;

  }

  public int getDenominator() {
//return the denominator

    return denominator;

  }

  public double getValue() {
    return (double) getNumerator() / getDenominator() ;

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
    if (getDenominator() == 1 ) {
      return ""+getNumerator();
    }
    if (getDenominator() == 0 ) return "0";
    return getNumerator() + "/" + getDenominator();

  }

  private static int gcd(int a , int b) {
//calculate the gcd of two integers using euclid's method
//used a khan academy article for this method
    int origa = a;
    if (b > a){

     a = b ;
      b = origa;
   }

    if (b == 0) return a;


    if (a % b == 0) return b;

    int remainder = a % b;
    while (remainder != 0){
      remainder = a% b;
      a = b ;
      b = remainder ;

    }

    return a;
  }

  private void reduce() {
//divide num and den by gcd
//add this after construction!!!!
    int greatestCD = gcd( getNumerator(), getDenominator() );
    numerator = getNumerator() / greatestCD ;
    denominator = getDenominator() / greatestCD ;

  }

  public RationalNumber multiply(RationalNumber other){
//return new rationalnumber : product of this and other

    return new RationalNumber( getNumerator() * other.getNumerator() ,getDenominator() * other.getDenominator() );


}

  public RationalNumber divide(RationalNumber other){
//return new RationalNumber that is this divided by other

//multiply by reciprocal
    return new RationalNumber( getNumerator() * other.getDenominator() ,
                               getDenominator() * other.getNumerator() );

  }

  public RationalNumber add(RationalNumber other){
//return new RationalNumber : sum of this and other

    return new RationalNumber((getNumerator() *other.getDenominator()) + (other.getNumerator() * getDenominator() ),
                               getDenominator() * other.getDenominator() );
  }

  public RationalNumber subtract(RationalNumber other){
//return a RationalNumber : this minus other

    return new RationalNumber((getNumerator() *other.getDenominator()) - (other.getNumerator() * getDenominator() ),
                               getDenominator() * other.getDenominator() );

  }



}
