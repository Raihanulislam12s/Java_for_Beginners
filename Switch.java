import java.util.Scanner;

public class Print_the_greeting_with_switch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int button= sc.nextInt();
        switch(button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Hi");
                break;
            case 3:
                System.out.println("How are you??");
                break;
            default:
                System.out.println("Invalid Button");
        }
    }
}
/*output
click 1:Hello
click 2:Hi
click 3:How are you??
click other:Invalid Button
*/
