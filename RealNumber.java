public class RealNumber extends Number {

  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue() {
    return value;
  }

  public String toString() {
    return ""+getValue();
  }

  //public boolean equals(RealNumber other){
//return true when values are within 0.001% of each other
//if one value is 0, other must exactly be zero
    //if (other.getValue() == 0) {
      //return (other.getValue() == getValue() );
  //  }
//    return (Math.abs(getValue() - other.getValue()) / getValue()) < 0.00001  ;

//  }

  public RealNumber add(RealNumber other){
//return a RealNumber that has the value of : the sum of this and other
//other can be any RealNumber (including a RationalNumber)

    return new RealNumber( other.getValue() + getValue() );

  }

  public RealNumber multiply(RealNumber other){
//return a new RealNumber: product of this and other

    return new RealNumber( other.getValue() * getValue() );

  }

  public RealNumber divide(RealNumber other){
//return a new RealNumber : this divided by other

    return new RealNumber( getValue() / other.getValue() );

  }

  public RealNumber subtract(RealNumber other){
//return a new RealNumber : this minus the other

    return new RealNumber( getValue() - other.getValue() );

  }

}
