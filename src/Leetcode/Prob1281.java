package Leetcode;

public class Prob1281{
    public int subtractProductAndSum(int n) {
        int pod = 1;
        int sod = 0;
        int Result;

        while(n>0){
            int rem = n%10;
            pod = pod*rem;
            sod = sod+rem;
            n = n/10;
        }
        Result = pod - sod;
        return Result;
    }
}

