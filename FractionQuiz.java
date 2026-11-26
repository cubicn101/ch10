import java.util.Scanner;
public class FractionQuiz{
   //import random? 1-9 or math.random AND RANDOM OPERATOR
   // array[] for  +/ - *S
   //set constructor producing random num&denom
   //import scanner to read user's ans
   // if statment for comparison
   // lowest term is the correct ans
   // calculate the percentage of accuracy
  /* int denom = FractionQuiz.current().nextInt(10); 
   * 1. set the game(4q and 8fr intotal and scanner) 4q 1q method
   * 2. check ans, scanner& comparison*/
   
   // call two fraction
   public static void main(String []agrs){
      Fraction f1 = new Fraction();
      Fraction f2 = new Fraction();

      String operator[] ={"+", "-", "*", "/"};
      int i = (int)(Math.random()*3)+1;
      
      // TESTline
      System.out.println();
      //out put
      System.out.println("Let's do a Fraction Quiz!"+ 
      " CAREFUL: Answer should be in lowest terms:) ");
      
      System.out.println(f1 + " "+ operator[i] + " " + f2 + "=");
      
      System.out.print("Your answered correctly");
      System.out.print(", getting out of 100");
      // how to set correct
      
   }

   
}
