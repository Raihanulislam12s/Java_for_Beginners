/*
7.Floyd's Triangle
--output--
  1 
  2 3 
  4 5 6 
  7 8 9 10 
  11 12 13 14 15 
*/

import java.util.*;

public class Floyds_Tringle {
    public static void main(String args[]){
        /*
        --User input--
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
         */
        int n =5;
        int num=1;
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for (int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

    }
}
