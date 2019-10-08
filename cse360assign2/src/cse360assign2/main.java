package cse360assign2;

public class main {
   public static void main(String[] args) {
       // create Calculator class object
       AddingMachine myCalculator = new AddingMachine();
       myCalculator.add (4);
       myCalculator.subtract (2);
       myCalculator.add(5);
       System.out.println(myCalculator.toString());
       System.out.println("Total = "+ myCalculator.getTotal());
   }
}