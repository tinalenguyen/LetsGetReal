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
    return 0.0;

  }

  public int getNumerator() {
//return numerator

    return numerator;

  }

  public int getDenominator() {
//return the denominator

    return denominator;

  }

}
