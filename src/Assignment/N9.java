package Assignment;

import java.util.Scanner;

public class N9 {
    //To find Armstrong Number between two given number.
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        for(int i= n1; i<=n2;i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int Org = n;
        int sum = 0;

        while(n>0){
            int rem = n%10;
            n =n/10;
            sum = sum + rem*rem*rem;
        }
        return sum==Org ;
    }
}
