import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your 'Name' and 'userId' to access your Bank account:");
        String name=sc.nextLine();
        String userId=sc.nextLine();
        account obj1=new account(name,userId);
        obj1.menu();
    }
}
