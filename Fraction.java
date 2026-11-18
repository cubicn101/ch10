public class Fraction{
  // instancev varible
  private int numerator, denominator;
  // private
  
  //constructive
  public Fraction(){ // default
      numerator = 1;
      denominator = 1;
  }
  public Fraction(int n, int d){ // parameterized construction
      numerator = n;
      SetDenom(d);
	   } 
  }
  // ex1
  public Fraction(String b){
	  int len = b.length();
	  int slash = b.indexOf("/");
	  numerator = Interger.parseInt(b.substring(0,1));
      denominator = Interger.parseInt(b.substring(len-1));
       SetDenom(Integer.parse(d));
      }
  }
  //??? copy of constructor???
  public Fraction(Fraction b){
	numerartor = b.numerator;
	denominator = b.denominator;
      }
  
  //behavior methods (access,mutator, helper)
  
  // accessor
  public int getNum(){
	  return numerator;

  public int getDen();{
	  return denominator;
  }
  
  public String toString(){
      return numerator + "/"+ denominator;
  }
  
  public double toDouble(int n){
	  double x = (double) n;
	  return x;
  }
  //mutator
  public void SetNum(int n){
	  numerator = n;
  }
  public void SetDenom(int d){
          if(d!=0){
          denominator = d;
       }else{
		   denominator =1;
		   System.out.println("Error: d cannot be zero");
	   } 
  }
}
