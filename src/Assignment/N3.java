package Assignment;

import java.util.Scanner;

public class N3 {
    //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float P = in.nextFloat();
        float T = in.nextFloat();
        int R = in.nextInt();
        float SI = P*R*T/100;
        System.out.println("Simple interest : " + SI);
    }
}
