/*  1-->Solid_Rectangle
output
*****
*****
*****
*****
 */
import java.util.*;

public class solid_Rectangle {
    public static void main(String args[]){
        //user input
        /*Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        */

        int n=4;
        int m=5;
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

