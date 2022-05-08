//Half_Pyramid
/*
output:
    *
    **
    ***
    ****
    *****
 */

import java.util.*;
public class half_Myramid {
    public static void main(String args[]){
        //user input
       /* Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        */
        int n=5;
        //outer loop
        for(int i=0;i<n;i++){
            //inner loop
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
