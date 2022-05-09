/*
8.0-1 Triangle
--output--
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
*/
import java.util.*;

public class zero_and_one_triangle {
    public static void main(String args[]){
        /*
        --input--
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
         */
        int n=5;
        //outer loop
        for(int i=0;i<=n;i++){
            //inner loop
            for (int j=1;j<=i;j++){
                int sum=i+j;
                if (sum% 2 ==0){//Even
                    System.out.print(" 1");
                }else {//odd
                    System.out.print(" 0");
                }
            }
            System.out.println();
        }
    }
}
