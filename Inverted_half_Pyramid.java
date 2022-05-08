/*
5.Inverted_half_Pyramid
--output--
    ****
    ***
    **
    *
 */

import java.util.*;
public class Inverted_half_Pyramid {
    public static void main(String args[]){
        /*
        user input
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
         */
        int n=4;
        //outer loop
        for (int i=n;i>=1;i--){
            //inner loop
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
