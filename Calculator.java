public class Calculator {
 public int add(int a,int b){
     return a+b;
 }
 public int add(int a,int b,int c){
     return a+b+c;
 }
 public double add(double a,double b){
     return a+b;
 }
 public static void main(String[]args){
     Calculator Calc = new Calculator();
     System.out.println("Sum of 2 and 3 is:" + Calc.add(2,3));
     System.out.println("Sum of 2.5 and 3.5 is:" + Calc.add(2.5,3.5));
 }   
}
