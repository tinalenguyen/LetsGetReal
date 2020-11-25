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



}
