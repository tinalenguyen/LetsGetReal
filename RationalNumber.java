public class RationalNumber extends RealNumber {

  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);
    numerator = nume;
    denominator = deno;

      if (deno < 0) deno = -deno; nume = -nume;
      if (deno == 0) nume = 0 ; deno = 1;
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

}
