import java.util.Scanner;

public class switch_case {
    public static void main(String[] args){
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("You're going to be an adult!");
                break;

            case 25:
                System.out.println("You're going to enter a working environment");
                break;

            case 60: 
                System.out.println("You're retired");
                break;
            
            default: 
                System.out.println("Good");
        }
    }
}
