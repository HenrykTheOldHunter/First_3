package com.company;

public class Main {

    public static void main(String[] args) {
        int[] Arr;
        Arr = new int[10];
        for(int i = 0; i < 10; i++) {
            Arr[i]=(int) (Math.random() * 10 + 1);
        }
        int j =0;
        int sum=0;
        while (j<10) {
            sum=sum+Arr[j];
            j++;
        }
        System.out.println(sum);
        j=0;
        sum=0;
        for (j=0;j<10;j++) {
            sum=sum+Arr[j];
        }
        System.out.println(sum);
        j=0;
        sum=0;
        do  {
            sum=sum+Arr[j];
            j++;
        } while (j<10);
        System.out.println(sum);
    }
}
