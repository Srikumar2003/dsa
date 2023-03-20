package Assignment;

import java.util.Scanner;

public class N4 {
    //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
      public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int num1 = in.nextInt();
          int num2 = in.nextInt();
          int Result = 0;
          char Op = in.next().trim().charAt(0);
          if( Op == '+' || Op == '-' || Op == '*' || Op == '/'){
              if(Op == '+'){
                  Result = num1 + num2;
              }
              if(Op == '-'){
                  Result = num1 - num2;
              }
              if(Op == '*'){
                  Result = num1*num2;
              }
              if(Op == '/') {
                  if(num2 != 0) {
                      Result = num1 / num2;
                  }
              }
          }
          else{
              System.out.println("Invalid Operator");
          }
          System.out.println(" The Result is :" + Result);
     }
}
