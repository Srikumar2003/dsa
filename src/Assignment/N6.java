package Assignment;

import java.util.Scanner;

public class N6 {
    //Input currency in rupees and output in USD.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Rupee = in.nextInt();
        float USD = 0.012f * Rupee;
        System.out.println("USD in Rupees : " + USD);
    }
}
