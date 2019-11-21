package app;
import java.util.Scanner;

/**
 * App
 */
public class App {

    public static void main(final String[] args) {
      Scanner userinput = new Scanner(System.in);
      double firstnum;
      String operator;
      double secondnum;
      /*
      double i;
      */
      operator = "";
      secondnum = 0;

      System.out.println("Enter first number");
      firstnum = userinput.nextDouble();

      while (true){
       System.out.println("Enter operator");
       operator = userinput.next();
       
       if (operator.equals("=")){
        System.out.println(firstnum);
        break;
       }
        System.out.println("Enter next number");
        secondnum = userinput.nextDouble();

       if (operator.equals("*")){
        firstnum = firstnum * secondnum;
        System.out.println(firstnum);
       } 
        else if(operator.equals("+")){
        firstnum = firstnum + secondnum;
        System.out.println(firstnum);
       }
      }
      userinput.close(); 
    }
}