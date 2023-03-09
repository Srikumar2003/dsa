package Darkcode;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //float num = input.nextFloat();
        //System.out.println(num);
        //int num = (int)(76.45f);
        //System.out.println(num);

        //Automatic type promotion
        //int a = 257;
        //byte b = (byte)(a);//byte size = 256, 256%257=1
        //System.out.println(b);

        byte a = 25;
        byte b = 76;
        byte c = 34;
        float d = (a*b)/c;
        System.out.println(d);
    }



}