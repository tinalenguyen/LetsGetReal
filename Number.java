public abstract class Number{

  public abstract double getValue();

  public int compareTo(Number other){
//return 0 when this equals other Number
//return negative value when this is smaller than the other
//return positibe when this number is larger than the other number

    if (getValue() == other.getValue() ) return 0;
    if (getValue() < other.getValue() ) return -1;
    else return 1;


  }

  public boolean equals(Number other){
//returns true when the % difference of the values are within 0.00001 of each other
//special case: if one is exactly zero, the other must be exactly zero

    if (getValue() == 0 || other.getValue() == 0 ){
      return (getValue() == other.getValue() );
    }

    return ( Math.abs( getValue() - other.getValue() ) / getValue() <= 0.00001 );

  }



}
