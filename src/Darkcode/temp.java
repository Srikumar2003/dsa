package Darkcode;

import java.util.Scanner;

public class temp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the temp in celsius");
        float tempC = input.nextFloat();
        float tempf = (tempC*9/5)+32;
        System.out.println("the temperature in Fahrenheit" + tempf);


    }

}
