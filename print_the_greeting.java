import java.util.*;

public class print_the_greeting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int button= sc.nextInt();

        if (button==1){
            System.out.println("Hello");
        }
        else if (button==2){
            System.out.println("Hi");
        }
        else if (button==3){
            System.out.println("How are you??");
        }else {
            System.out.println("Invalid Button");
        }
    }
}
