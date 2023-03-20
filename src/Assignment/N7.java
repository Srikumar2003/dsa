package Assignment;

import java.util.Scanner;

public class N7 {
    //To calculate Fibonacci Series up to n numbers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int p = 1;
        int count = 2;

        while(count<=n){
            int temp = p;
            p = p + i;
            i = temp;
            count++;
        }
        System.out.println(p);
    }
}
