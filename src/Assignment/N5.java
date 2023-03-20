package Assignment;

import java.util.Scanner;

public class N5 {
    //Take 2 numbers as input and print the largest number
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if( num1 > num2){
            System.out.println("The largest number is :" + num1);
        }
        if( num2 > num1){
            System.out.println("The largest number is :" + num2);
        }
    }
}
