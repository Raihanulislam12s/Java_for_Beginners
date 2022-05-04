import java.util.Scanner;

public class if_else1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if (age>18){
            System.out.println("adult");
        }
        else{
            System.out.println("Not adult");
        }

    }
}
