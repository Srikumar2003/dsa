package Assignment;

import java.util.Scanner;

public class No1 {
    //Write a program to print whether a number is even or odd, also take input from the user.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num % 2 == 0){
            System.out.println("Even number :" + num);
        }
        else{
            System.out.println("Odd Number :" + num);
        }
    }
}
