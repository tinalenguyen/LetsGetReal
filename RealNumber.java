public class RealNumber {

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

  public boolean equals(RealNumber other){
//return true when values are within 0.001% of each other
//if one value is 0, other must exactly be zero
    if (other.getValue() == 0 && getValue() == 0){
      return true;
    }


    if ( (Math.abs(other.getValue() - getValue())) / other.getValue() < 0.00001 ) {
         return true;
       }
    else return false;
  }

}
