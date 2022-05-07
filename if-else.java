import java.util.Scanner;

public class if_else1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if (age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }

    }
}
/*output
Enter lassdan 18:Adult
Enter 18 up:Not Adult
