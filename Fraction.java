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
      if(d!=0){
          denominator = d;
       }else{
		   denominator =1;
		   System.out.println("Error: d cannot be zero");
	   } 
  }
  
  //behavior methods
  
}
