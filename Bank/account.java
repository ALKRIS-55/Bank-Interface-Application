import java.util.Scanner;

class account{
    double balance;
    double previousTransaction;
    String userName;
    String userId;

    account(String userName,String userId){
        this.userName=userName;
        this.userId=userId;
    }


    void deposit(double amount){
        if(amount!=0){
            balance+=amount;
            previousTransaction=amount;
        }
    }

    void withdraw(double _amount){
        if(_amount!=0 && balance>=_amount){
            balance-=_amount;
            previousTransaction=-_amount;
        } else if(balance<_amount){
            System.out.println("Bank balanceance insufficient");
        }
    }

    void extractPreviousTransaction(){
        if(previousTransaction>0){
            System.out.println("Deposited: "+previousTransaction);
        } else if(previousTransaction<0){
            System.out.println("Withdrawn: "+Math.abs(previousTransaction));
        } else{
            System.out.println("No transaction occured");
        }
    }

    void menu(){
        char opt;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome "+userName);
        System.out.println("Your ID:"+userId);
        System.out.println("\n");
        System.out.println("A) Check balanceance");
        System.out.println("B) Deposit Amount");
        System.out.println("C) Withdraw Amount");
        System.out.println("D) Previous Transaction");
        System.out.println("E) Exit");

        do{
            System.out.println("============================================");
            System.out.print("Choose an option : ");
            char opt1=sc.next().charAt(0);
            opt = Character.toUpperCase(opt1);
            System.out.println("\n");

            switch (opt){
                case 'A':
                    System.out.println("-----------------------");
                    System.out.print("balanceance = $"+balance);
                    System.out.println("\n");
                    break;
                case 'B':
                    System.out.println("-----------------------");
                    System.out.print("Enter a amount to deposit : $");
                    double _amount=sc.nextDouble();
                    deposit(_amount);
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println("-----------------------");
                    System.out.print("Enter a amount to Withdraw : $");
                    double _amountW=sc.nextDouble();
                    withdraw(_amountW);
                    System.out.println("\n");
                    break;
                case 'D':
                    System.out.println("-----------------------");
                    System.out.print("Previous Transaction : ");
                    extractPreviousTransaction();
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("-----------------------");
                    break;
                default:
                    System.out.println("Error : Choose a correct opt to proceed");
                    break;
            }

        }while(opt!='E');

        System.out.println("Thank you for using our banking services");
    }

}