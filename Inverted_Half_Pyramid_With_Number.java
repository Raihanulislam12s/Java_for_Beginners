/*
6.Inverted Half Pyramid With Number
    --output--
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
 */

import java.util.*;

public class Inverted_half_pyramid_number {
    public static void main(String args[]){
       /*
       -- user input --
       Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();

         */
        int n=5;
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
