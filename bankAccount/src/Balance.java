import java.util.Scanner;
public class Balance {
    public double balance = 0;
    public void add (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much do you want to add? ");
        double amount = scanner.nextDouble();

        if(amount> 0){
            balance += amount;
        }else{
            System.out.println("Amount must be higher than 0!");
        }
        System.out.println("New balance: " + balance);

    }

}
